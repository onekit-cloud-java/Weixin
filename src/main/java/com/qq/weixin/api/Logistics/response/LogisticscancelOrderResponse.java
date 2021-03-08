package com.qq.weixin.api.Logistics.response;

public class LogisticscancelOrderResponse {
    private String errmsg;
    private int errcode;
    private String delivery_resultmsg;
    private int delivery_resultcode;

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getDelivery_resultmsg() {
        return delivery_resultmsg;
    }

    public void setDelivery_resultmsg(String delivery_resultmsg) {
        this.delivery_resultmsg = delivery_resultmsg;
    }

    public int getDelivery_resultcode() {
        return delivery_resultcode;
    }

    public void setDelivery_resultcode(int delivery_resultcode) {
        this.delivery_resultcode = delivery_resultcode;
    }
}
