package com.qq.weixin.api.request;

public class GetOrderRequest {
    private String access_token;
    private String shopid;
    private String shop_order_id;
    private String shop_no;
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

    public String getShop_no() {
        return shop_no;
    }

    public void setShop_no(String shop_no) {
        this.shop_no = shop_no;
    }

    public String getDelivery_sign() {
        return delivery_sign;
    }

    public void setDelivery_sign(String delivery_sign) {
        this.delivery_sign = delivery_sign;
    }
}
