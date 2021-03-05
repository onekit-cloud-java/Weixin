package com.qq.weixin.api.response;

public class PreAddOrderResponse {
    private int resultcode;
    private String resultmsg;
    private int fee;
    private int deliverfee;
    private int couponfee;
    private int tips;
    private int insurancefee;
    private int distance;
    private String delivery_token;
    private int dispatch_duration;

    public String getDelivery_token() {
        return delivery_token;
    }

    public void setDelivery_token(String delivery_token) {
        this.delivery_token = delivery_token;
    }

    public int getResultcode() {
        return resultcode;
    }

    public void setResultcode(int resultcode) {
        this.resultcode = resultcode;
    }

    public String getResultmsg() {
        return resultmsg;
    }

    public void setResultmsg(String resultmsg) {
        this.resultmsg = resultmsg;
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    public int getDeliverfee() {
        return deliverfee;
    }

    public void setDeliverfee(int deliverfee) {
        this.deliverfee = deliverfee;
    }

    public int getCouponfee() {
        return couponfee;
    }

    public void setCouponfee(int couponfee) {
        this.couponfee = couponfee;
    }

    public int getTips() {
        return tips;
    }

    public void setTips(int tips) {
        this.tips = tips;
    }

    public int getInsurancefee() {
        return insurancefee;
    }

    public void setInsurancefee(int insurancefee) {
        this.insurancefee = insurancefee;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


    public int getDispatch_duration() {
        return dispatch_duration;
    }

    public void setDispatch_duration(int dispatch_duration) {
        this.dispatch_duration = dispatch_duration;
    }
}
