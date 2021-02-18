package com.qq.weixin.api.request;

public class GetAccessTokenRequest {
    private String appid;
    private String secret;
    public enum grant_type{
        client_credential,
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
}
