package com.qq.weixin.api.Cloudbase.request;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class SendSmsRequest {
    private String access_token;
    private String env;
    private ArrayList<String> phone_number_list;
    private String content;
    private String path;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public ArrayList<String> getPhone_number_list() {
        return phone_number_list;
    }

    public void setPhone_number_list(ArrayList<String> phone_number_list) {
        this.phone_number_list = phone_number_list;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
