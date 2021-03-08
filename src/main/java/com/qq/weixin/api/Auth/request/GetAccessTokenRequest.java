package com.qq.weixin.api.Auth.request;
@SuppressWarnings("unused")
public class GetAccessTokenRequest {
    private String appid;
    private String secret;
    private Grant_type grant_type;
    public enum Grant_type{
        client_credential,
    }

    public Grant_type getGrant_type() {
        return grant_type;
    }

    public void setGrant_type(Grant_type grant_type) {
        this.grant_type = grant_type;
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
