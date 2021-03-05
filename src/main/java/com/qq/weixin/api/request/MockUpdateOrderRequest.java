package com.qq.weixin.api.request;

public class MockUpdateOrderRequest {
    private String access_token;
    private String shopid;
    private String shop_order_id;
    private int action_time;
    private int order_status;
    private String action_msg;

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

    public int getAction_time() {
        return action_time;
    }

    public void setAction_time(int action_time) {
        this.action_time = action_time;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public String getAction_msg() {
        return action_msg;
    }

    public void setAction_msg(String action_msg) {
        this.action_msg = action_msg;
    }
}
