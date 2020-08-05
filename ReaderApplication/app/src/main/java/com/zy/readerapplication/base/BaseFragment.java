package com.zy.readerapplication.base;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zy.readerapplication.presenters.FragmentPresenter;

/**
 * @author seven
 * @description
 * @date 2020/7/27.
 */
public class BaseFragment extends Fragment {
    private FragmentPresenter presenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (!isPresenterEmpty()) {
            return presenter.onCreateView(inflater, container, savedInstanceState);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!isPresenterEmpty()) {
            presenter.onViewCreated(view, savedInstanceState);
        }
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (!isPresenterEmpty()) {
            presenter.onAttach(context);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        if (!isPresenterEmpty()) {
            presenter.onStart();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        if (!isPresenterEmpty()) {
            presenter.onResume();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        if (!isPresenterEmpty()) {
            presenter.onPause();
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        if (!isPresenterEmpty()) {
            presenter.onStop();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (!isPresenterEmpty()) {
            presenter.onDestroy();
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (!isPresenterEmpty()) {
            presenter.onDestroyView();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        if (!isPresenterEmpty()) {
            presenter.onDetach();
        }
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (!isPresenterEmpty()) {
            presenter.onActivityResult(requestCode, resultCode, data);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (!isPresenterEmpty()) {
            presenter.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private boolean isPresenterEmpty() {
        return presenter == null;
    }

    public FragmentPresenter getPresenter() {
        return presenter;
    }

    public void setPresenter(FragmentPresenter presenter) {
        this.presenter = presenter;
    }
}
