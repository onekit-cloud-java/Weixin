package com.qq.weixin.api.Logistics.request;


public class LogisticsupdatePathRequest {
    private String access_token;
    private String token;
    private String waybill_id;
    private long action_time;
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

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public long getAction_time() {
        return action_time;
    }

    public void setAction_time(long action_time) {
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
