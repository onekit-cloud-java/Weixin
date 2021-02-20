package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class MsgSecCheckRequest {
    private String access_token;
    private String content;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
