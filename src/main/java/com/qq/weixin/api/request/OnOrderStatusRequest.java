package com.qq.weixin.api.request;

public class OnOrderStatusRequest {
    private String ToUserName;
    private String FromUserName;
    private int CreateTime;
    private String MsgType;
    private String Event;
    private String shopid;
    private String shop_order_id;
    private String shop_no;
    private String waybill_id;
    private int action_time;
    private int order_status;
    private String action_msg;
    private Agent agent;
    public static class Agent{
        private String name;
        private String phone;
        private int reach_time;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public int getReach_time() {
            return reach_time;
        }

        public void setReach_time(int reach_time) {
            this.reach_time = reach_time;
        }
    }

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public int getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(int createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
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

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }
}
