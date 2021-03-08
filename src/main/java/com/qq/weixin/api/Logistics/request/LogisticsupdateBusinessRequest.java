package com.qq.weixin.api.Logistics.request;

public class LogisticsupdateBusinessRequest {
    private String access_token;
    private String shop_app_id;
    private String biz_id;
    private String result_code;
    private String result_msg;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getShop_app_id() {
        return shop_app_id;
    }

    public void setShop_app_id(String shop_app_id) {
        this.shop_app_id = shop_app_id;
    }

    public String getBiz_id() {
        return biz_id;
    }

    public void setBiz_id(String biz_id) {
        this.biz_id = biz_id;
    }

    public String getResult_code() {
        return result_code;
    }

    public void setResult_code(String result_code) {
        this.result_code = result_code;
    }

    public String getResult_msg() {
        return result_msg;
    }

    public void setResult_msg(String result_msg) {
        this.result_msg = result_msg;
    }
}