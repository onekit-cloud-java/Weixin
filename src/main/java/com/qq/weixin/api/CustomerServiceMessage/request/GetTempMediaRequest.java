package com.qq.weixin.api.CustomerServiceMessage.request;
@SuppressWarnings("unused")
public class GetTempMediaRequest {
    private String access_token;
    private String media_id;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }
}
