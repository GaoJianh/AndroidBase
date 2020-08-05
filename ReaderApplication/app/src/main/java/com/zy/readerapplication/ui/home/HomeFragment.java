package com.zy.readerapplication.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.zy.readerapplication.R;
import com.zy.readerapplication.adaptors.MyAdapter;
import com.zy.readerapplication.api.LoginApi;
import com.zy.readerapplication.model.StudentBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        RecyclerView rv = root.findViewById(R.id.home_fragment_rv);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(getContext(), RecyclerView.VERTICAL, false));
        MyAdapter myAdapter = new MyAdapter(getContext().getApplicationContext());
        //TestAdapter myAdapter = new TestAdapter();
        myAdapter.setDataList(createStudents(100));
        rv.setAdapter(myAdapter);
        new Thread() {
            @Override
            public void run() {
                try {
                    LoginApi.SignUpByAccountNumber("wx0ef12d8e82574dc6", "gaojan", "123456");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        return root;
    }

    private List<StudentBean> createStudents(int i) {
        ArrayList<StudentBean> students = new ArrayList<>();
        int m = 0;
        while (m < i) {
            students.add(new StudentBean("李" + m));
            m++;
        }
        return students;
    }
}