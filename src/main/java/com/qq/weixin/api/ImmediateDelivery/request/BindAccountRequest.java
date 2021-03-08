package com.qq.weixin.api.ImmediateDelivery.request;

public class BindAccountRequest {
    private String access_token;
    private String delivery_id;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }
}
