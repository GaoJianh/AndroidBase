package com.zy.readerapplication.presenters;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.zy.readerapplication.base.BaseActivity;

/**
 * @author seven
 * @description
 * @date 2020/7/27.
 */
public abstract class ActivityPresenter<T extends BaseActivity> implements Presenter {
    protected T activity;
    public abstract void onBackPressed();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {

    }

    protected boolean isActivityNull() {
        return activity == null;
    }
}
