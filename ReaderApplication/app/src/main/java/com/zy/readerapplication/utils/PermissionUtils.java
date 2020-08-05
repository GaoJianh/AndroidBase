package com.zy.readerapplication.utils;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

import androidx.core.app.ActivityCompat;

public class PermissionUtils {
    /**
     * 请求单个权限
     * @param context activity
     * @param requestCode request code
     * @param permission request permission
     */
    public static void requestPermission(Context context, int requestCode, String permission) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (context.checkSelfPermission(permission)!= PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions((Activity) context, new String[]{permission}, requestCode);
            }
        }
    }

    /**
     * 一次请求多个权限
     * @param context activity
     * @param requestCode request code
     * @param permissions request permissions
     */
    public static void requestPermissions(Context context, int requestCode, String[] permissions) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            for (String permission: permissions) {
                if (context.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                    ActivityCompat.requestPermissions((Activity) context, new String[]{permission}, requestCode);
                }
            }
        }
    }

    public static boolean checkPermissionHasGot(Context context, String permission) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (context.checkSelfPermission(permission) != PackageManager.PERMISSION_GRANTED) {
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }
}
