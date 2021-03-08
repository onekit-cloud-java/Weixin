package com.qq.weixin.api.ImmediateDelivery.request;

public class RealMockUpdateOrderRequest {
    private String access_token;
    private String shopid;
    private String shop_order_id;
    private String action_time;
    private String order_status;
    private String action_msg;
    private String delivery_sign;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getShopid() {
        return shopid;
    }

    public void setShopid(String shopid) {
        this.shopid = shopid;
    }

    public String getShop_order_id() {
        return shop_order_id;
    }

    public void setShop_order_id(String shop_order_id) {
        this.shop_order_id = shop_order_id;
    }

    public String getAction_time() {
        return action_time;
    }

    public void setAction_time(String action_time) {
        this.action_time = action_time;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getAction_msg() {
        return action_msg;
    }

    public void setAction_msg(String action_msg) {
        this.action_msg = action_msg;
    }

    public String getDelivery_sign() {
        return delivery_sign;
    }

    public void setDelivery_sign(String delivery_sign) {
        this.delivery_sign = delivery_sign;
    }
}
