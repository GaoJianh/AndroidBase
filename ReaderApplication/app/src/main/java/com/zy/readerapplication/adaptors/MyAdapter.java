package com.zy.readerapplication.adaptors;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.zy.readerapplication.R;
import com.zy.readerapplication.base.BaseAdapter;
import com.zy.readerapplication.base.BaseViewHolder;
import com.zy.readerapplication.model.StudentBean;
import com.zy.readerapplication.vh.MyViewHolder;

import java.util.ArrayList;

/**
 * @author seven
 * @description
 * @date 2020/8/1.
 */
public class MyAdapter extends BaseAdapter<StudentBean, MyViewHolder> {
    private Context context;

    public MyAdapter(Context context) {
        this.context = context;
        dataList = new ArrayList<>();
    }

    @Override
    protected int getItemLayoutId(int viewType) {
        return R.layout.my_holder_layout;
    }

    @Override
    protected MyViewHolder createViewHolder(View view, BaseViewHolder.HolderClickListener holderClickListener) {
        return new MyViewHolder(view, holderClickListener);
    }

    @Override
    protected BaseViewHolder.HolderClickListener bindItemClickListener() {
        return new BaseViewHolder.HolderClickListener() {
            @Override
            public void onClick(int position) {
                if (!isDataListNull()) {
                    Toast.makeText(context, dataList.get(position).toString(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, context.getString(R.string.app_name) + position, Toast.LENGTH_SHORT).show();
                }
            }
        };
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return super.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        if (dataList.size() - 1 > position) {
            holder.textView.setText(dataList.get(position).toString());
        }
    }
}
