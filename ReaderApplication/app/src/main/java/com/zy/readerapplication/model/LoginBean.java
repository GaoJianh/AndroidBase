package com.zy.readerapplication.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * @author seven
 * @description
 * @date 2020/8/4.
 */
public class LoginBean implements Serializable {

    /**
     * msg : 成功
     * code : 0
     * data : {"userId":11946175,"openId":"o5RIFwfV2CtD3MxA6IThnRX0VUZk","unionId":"oHetQ5gVS6VLdDNacFUvcFgNOcNw","userName":"taohua","userHeadImg":"http://thirdwx.qlogo.cn/mmopen/vi_32/DYAIOgq83epELfdY4fIicPHOAp8qaFmPKtLwtJGCGNI7LBWAO5yIOZ8HQDL4TVMk07icwkKicKndQFT5kibxFteicyA/132","userGender":2,"loginName":null,"loginType":1,"qq":null,"weixin":null,"mobile":null,"email":null,"bookBalance":0,"vipState":0,"vipDays":0,"vipStartDate":null,"vipEndDate":null}
     */
    @Expose
    @SerializedName("msg")
    private String msg;
    @Expose
    @SerializedName("code")
    private String code;
    @Expose
    @SerializedName("data")
    private LoginDataBean data;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public LoginDataBean getData() {
        return data;
    }

    public void setData(LoginDataBean data) {
        this.data = data;
    }

}
