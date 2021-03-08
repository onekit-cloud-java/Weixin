package com.qq.weixin.api.Logistics.request;

public class LogisticsupdatePrinterRequest {
    private String access_token;
    private String openid;
    private Updatetype update_type;
    private String tagid_list;

    public enum Updatetype{
        bind,
        unbind,
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Updatetype getUpdate_type() {
        return update_type;
    }

    public void setUpdate_type(Updatetype update_type) {
        this.update_type = update_type;
    }

    public String getTagid_list() {
        return tagid_list;
    }

    public void setTagid_list(String tagid_list) {
        this.tagid_list = tagid_list;
    }
}
