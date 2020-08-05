package com.zy.readerapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author seven
 * @description
 * @date 2020/8/4.
 */
public class LoginDataBean implements Serializable {
    @Expose
    @SerializedName("userId")
    private int userId;
    @Expose
    @SerializedName("openId")
    private String openId;
    @Expose
    @SerializedName("unionId")
    private String unionId;
    @Expose
    @SerializedName("userName")
    private String userName;
    @Expose
    @SerializedName("userHeadImg")
    private String userHeadImg;
    @Expose
    @SerializedName("userGender")
    private int userGender;
    @Expose
    @SerializedName("loginName")
    private Object loginName;
    @Expose
    @SerializedName("loginType")
    private int loginType;
    @Expose
    @SerializedName("qq")
    private Object qq;
    @Expose
    @SerializedName("weixin")
    private Object weixin;
    @Expose
    @SerializedName("mobile")
    private Object mobile;
    @Expose
    @SerializedName("email")
    private Object email;
    @Expose
    @SerializedName("bookBalance")
    private int bookBalance;
    @Expose
    @SerializedName("vipState")
    private int vipState;
    @Expose
    @SerializedName("vipDays")
    private int vipDays;
    @Expose
    @SerializedName("vipStartDate")
    private Object vipStartDate;
    @Expose
    @SerializedName("vipEndDate")
    private Object vipEndDate;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserHeadImg() {
        return userHeadImg;
    }

    public void setUserHeadImg(String userHeadImg) {
        this.userHeadImg = userHeadImg;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public Object getLoginName() {
        return loginName;
    }

    public void setLoginName(Object loginName) {
        this.loginName = loginName;
    }

    public int getLoginType() {
        return loginType;
    }

    public void setLoginType(int loginType) {
        this.loginType = loginType;
    }

    public Object getQq() {
        return qq;
    }

    public void setQq(Object qq) {
        this.qq = qq;
    }

    public Object getWeixin() {
        return weixin;
    }

    public void setWeixin(Object weixin) {
        this.weixin = weixin;
    }

    public Object getMobile() {
        return mobile;
    }

    public void setMobile(Object mobile) {
        this.mobile = mobile;
    }

    public Object getEmail() {
        return email;
    }

    public void setEmail(Object email) {
        this.email = email;
    }

    public int getBookBalance() {
        return bookBalance;
    }

    public void setBookBalance(int bookBalance) {
        this.bookBalance = bookBalance;
    }

    public int getVipState() {
        return vipState;
    }

    public void setVipState(int vipState) {
        this.vipState = vipState;
    }

    public int getVipDays() {
        return vipDays;
    }

    public void setVipDays(int vipDays) {
        this.vipDays = vipDays;
    }

    public Object getVipStartDate() {
        return vipStartDate;
    }

    public void setVipStartDate(Object vipStartDate) {
        this.vipStartDate = vipStartDate;
    }

    public Object getVipEndDate() {
        return vipEndDate;
    }

    public void setVipEndDate(Object vipEndDate) {
        this.vipEndDate = vipEndDate;
    }
}
