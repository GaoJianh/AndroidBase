package com.zy.readerapplication;


import android.app.Application;

import com.mob.MobSDK;
import com.tencent.smtt.sdk.QbSdk;

/**
 * @author seven
 * @description
 * @date 2020/7/28.
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        QbSdk.initX5Environment(this,null);
        MobSDK.submitPolicyGrantResult(true, null);
    }
}
