package com.zy.readerapplication.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * @author seven
 * @description
 * @date 2020/7/3.
 */
public class NetWorkUtils {
    /**
     * Get network type
     *
     * @param context context
     * @return return th network type
     */
    public static int getNetworkType(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager)context
                .getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager == null ? null : connectivityManager.getActiveNetworkInfo();
        return networkInfo == null ? -1 : networkInfo.getType();
    }

    public static boolean isNetworkAvailable(Context paramContext) {
        int[] arrayOfInt = new int[2];
        arrayOfInt[0] = 0;
        arrayOfInt[1] = 1;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager)paramContext.getSystemService(Context.CONNECTIVITY_SERVICE);
            int j = arrayOfInt.length;
            for (int i = 0; i < j; i++) {
                int k = arrayOfInt[i];
                NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
                if (networkInfo != null) {
                    int m = networkInfo.getType();
                    if (m == k) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception exception) {
            return false;
        }
    }


}
