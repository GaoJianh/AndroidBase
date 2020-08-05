package com.example.newbiechen.ireader.utils;

import android.widget.Toast;

import com.example.newbiechen.ireader.AppReader;

/**
 * Created by newbiechen on 17-5-11.
 */

public class ToastUtils {

    public static void show(String msg){
        Toast.makeText(AppReader.getContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
