package com.qq.weixin.api.ImmediateDelivery.request;

public class CancelOrderrRequest {
    private String access_token;
    private String shopid;
    private String shop_order_id;
    private String shop_no;
    private String delivery_sign;
    private String delivery_id;
    private String waybill_id;
    private Cancelreasonid cancel_reason_id;
    private String cancel_reason;

    public enum Cancelreasonid{
        one(1),
        two(2),
        three(3),
        four(4),
        five(5),
        six(6);
        private int value;

        Cancelreasonid(int i) {
          this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

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

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public Cancelreasonid getCancel_reason_id() {
        return cancel_reason_id;
    }

    public void setCancel_reason_id(Cancelreasonid cancel_reason_id) {
        this.cancel_reason_id = cancel_reason_id;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }
}
