package com.qq.weixin.api.Cloudbase.request;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class GetOpenDataRequest {
    private String access_token;
    private ArrayList<String> cloudid_list;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public ArrayList<String> getCloudid_list() {
        return cloudid_list;
    }

    public void setCloudid_list(ArrayList<String> cloudid_list) {
        this.cloudid_list = cloudid_list;
    }
}
