package com.qq.weixin.api.request;

public class ApplyPluginRequest {
    private String access_token;
    private String action;
    private String plugin_appid;
    private String reason;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getPlugin_appid() {
        return plugin_appid;
    }

    public void setPlugin_appid(String plugin_appid) {
        this.plugin_appid = plugin_appid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
