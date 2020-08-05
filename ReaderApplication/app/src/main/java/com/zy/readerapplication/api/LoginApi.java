package com.zy.readerapplication.api;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.zy.readerapplication.model.LoginDataBean;
import com.zy.readerapplication.utils.OkHttpUtils;

import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author seven
 * @description
 * @date 2020/8/4.
 */
public class LoginApi {
    private static final String LOGIN_BASE_URL = "http://xx.com/user/login";

    public static void loginByUserId(int userId) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("loginType", LoginType.userId);
        params.put("userId", userId);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post(LOGIN_BASE_URL, json.toString());
        LoginDataBean bean = new Gson().fromJson(data, LoginDataBean.class);
    }

    public static void LoginByOpenId(String appId, String openId) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("loginType", LoginType.openId);
        params.put("appId", appId);
        params.put("openId", openId);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post(LOGIN_BASE_URL, json.toString());
    }

    //账号登录
    public static void LoginByAccountNumber(String appId, String loginName, String loginPwd) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("isReg", 0);//0登录，1注册
        params.put("loginType", LoginType.accountNumber);
        params.put("appId", appId);
        params.put("loginName", loginName);
        params.put("loginPwd", loginPwd);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post(LOGIN_BASE_URL, json.toString());

    }

    //账号注册
    public static void SignUpByAccountNumber(String appId, String loginName, String loginPwd) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("isReg", 1);//0登录，1注册
        params.put("loginType", 2);
        params.put("appId", appId);
        params.put("loginName", loginName);
        params.put("loginPwd", loginPwd);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post(LOGIN_BASE_URL, json.toString());
        Log.e("data", data);
    }

    public static void LoginByWeiXin(String appId, String weixin) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("loginType", LoginType.weiXin);
        params.put("appId", appId);
        params.put("weixin", weixin);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post(LOGIN_BASE_URL, json.toString());
    }

    public static void LoginByQQ(String appId, String qq) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("loginType", LoginType.qq);
        params.put("appId", appId);
        params.put("qq", qq);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post(LOGIN_BASE_URL, json.toString());
    }

    public static void FirstPage(int userId, String appId, String number) throws IOException {
        ConcurrentHashMap params = new ConcurrentHashMap();
        params.put("userId", userId);
        params.put("appId", appId);
        params.put("number", number);
        JSONObject json = new JSONObject(params);
        String data = OkHttpUtils.post("http://xx.com/bookstore/index", json.toString());
        Log.i("data", data);
    }
}
