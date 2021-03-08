package com.qq.weixin.api.Logistics.response;

import java.util.List;

public class LogisticsgetPrinterResponse {
    private String count;
    private List<String> openid;
    private List<String> tagid_list;

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<String> getOpenid() {
        return openid;
    }

    public void setOpenid(List<String> openid) {
        this.openid = openid;
    }

    public List<String> getTagid_list() {
        return tagid_list;
    }

    public void setTagid_list(List<String> tagid_list) {
        this.tagid_list = tagid_list;
    }
}
