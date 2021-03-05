package com.qq.weixin.api.response;

public class PreCancelOrderResponse {
    private String desc;
    private int deduct_fee;

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getDeduct_fee() {
        return deduct_fee;
    }

    public void setDeduct_fee(int deduct_fee) {
        this.deduct_fee = deduct_fee;
    }
}
