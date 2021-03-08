package com.qq.weixin.api.CustomerServiceMessage.request;
@SuppressWarnings("unused")
public class SetTypingRequest {
    private String access_token;
    private String touser;

    public enum command{
        Typing,
        CancelTyping
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }
}
