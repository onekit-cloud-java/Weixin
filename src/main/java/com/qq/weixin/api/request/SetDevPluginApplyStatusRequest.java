package com.qq.weixin.api.request;

public class SetDevPluginApplyStatusRequest {
    private String access_token;
    private String appid;
    private String reason;
    public enum action{
        dev_agree,
        dev_refuse,
        dev_delete,
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
