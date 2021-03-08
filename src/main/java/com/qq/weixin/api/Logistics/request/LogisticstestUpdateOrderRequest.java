package com.qq.weixin.api.Logistics.request;


public class LogisticstestUpdateOrderRequest {
    private String access_token;
    private String biz_id;
    private String order_id;
    private String delivery_id;
    private String waybill_id;
    private int action_time;
    private Actiontype action_type;
    private String action_msg;

    public enum Actiontype{
        a100001(100001),
        a100002(100002),
        a100003(100003),
        a200001(200001),
        a300002(300002),
        a300003(300003),
        a300004(300004),
        a400001(400001),
        a400002(400002);
        private int value;

        Actiontype(int i) {
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

    public String getBiz_id() {
        return biz_id;
    }

    public void setBiz_id(String biz_id) {
        this.biz_id = biz_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
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

    public int getAction_time() {
        return action_time;
    }

    public void setAction_time(int action_time) {
        this.action_time = action_time;
    }

    public Actiontype getAction_type() {
        return action_type;
    }

    public void setAction_type(Actiontype action_type) {
        this.action_type = action_type;
    }

    public String getAction_msg() {
        return action_msg;
    }

    public void setAction_msg(String action_msg) {
        this.action_msg = action_msg;
    }
}
