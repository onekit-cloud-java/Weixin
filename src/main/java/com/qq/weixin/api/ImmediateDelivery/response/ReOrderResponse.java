package com.qq.weixin.api.ImmediateDelivery.response;

public class ReOrderResponse {
    private int resultcode;
    private String resultmsg;
    private int fee;
    private int deliverfee;
    private int couponfee;
    private int tips;
    private int insurancefee;
    private int distance;
    private String waybill_id;
    private int order_status;
    private int finish_code;
    private int pickup_code;
    private int dispatch_duration;

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public int getFinish_code() {
        return finish_code;
    }

    public void setFinish_code(int finish_code) {
        this.finish_code = finish_code;
    }

    public int getPickup_code() {
        return pickup_code;
    }

    public void setPickup_code(int pickup_code) {
        this.pickup_code = pickup_code;
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
