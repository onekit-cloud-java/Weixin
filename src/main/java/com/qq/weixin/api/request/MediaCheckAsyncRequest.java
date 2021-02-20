package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class MediaCheckAsyncRequest {
    private String access_token;
    private String media_url;
    private int media_type;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getMedia_url() {
        return media_url;
    }

    public void setMedia_url(String media_url) {
        this.media_url = media_url;
    }

    public int getMedia_type() {
        return media_type;
    }

    public void setMedia_type(int media_type) {
        this.media_type = media_type;
    }
}
