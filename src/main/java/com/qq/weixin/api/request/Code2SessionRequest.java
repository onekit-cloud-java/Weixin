package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class Code2SessionRequest {
    private String appid;
    private String secret;
    private String js_code;


    public enum grant_type{
        authorization_code,
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public String getJs_code() {
        return js_code;
    }

    public void setJs_code(String js_code) {
        this.js_code = js_code;
    }

}