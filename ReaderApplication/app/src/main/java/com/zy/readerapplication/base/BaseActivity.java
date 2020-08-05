package com.zy.readerapplication.base;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.zy.readerapplication.presenters.ActivityPresenter;

/**
 * @author seven
 * @description
 * @date 2020/7/27.
 */
public abstract class BaseActivity<T extends ActivityPresenter> extends AppCompatActivity {
    private T presenter;

    //bind presenter
    protected abstract void bindPresenter();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        bindPresenter();
        super.onCreate(savedInstanceState);
        if (!isPresenterEmpty()) {
            presenter.onCreate(savedInstanceState);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!isPresenterEmpty()) {
            presenter.onStart();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!isPresenterEmpty()) {
            presenter.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (!isPresenterEmpty()) {
            presenter.onPause();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        if (!isPresenterEmpty()) {
            presenter.onStop();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (!isPresenterEmpty()) {
            presenter.onDestroy();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
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

    @Override
    public void onBackPressed() {
        if (!isPresenterEmpty()) {
            presenter.onBackPressed();
        }
    }

    protected boolean isPresenterEmpty() {
        return presenter == null;
    }

    public T getPresenter() {
        return presenter;
    }

    protected void setPresenter(T presenter) {
        this.presenter = presenter;
    }
}
