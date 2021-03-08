package com.qq.weixin.api.Logistics.request;

import java.util.List;

public class LogisticsonPathUpdateRequset {
    private String ToUserName;
    private String FromUserName;
    private int CreateTime;
    private String MsgType;
    private String Event;
    private String DeliveryID;
    private String WayBillId;
    private String OrderId;
    private int Version;
    private int Count;
    private List<Action> Actions;
    public static class Action{
        private int ActionTime;
        private int ActionType;
        private String ActionMsg;

        public int getActionTime() {
            return ActionTime;
        }

        public void setActionTime(int actionTime) {
            ActionTime = actionTime;
        }

        public int getActionType() {
            return ActionType;
        }

        public void setActionType(int actionType) {
            ActionType = actionType;
        }

        public String getActionMsg() {
            return ActionMsg;
        }

        public void setActionMsg(String actionMsg) {
            ActionMsg = actionMsg;
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

    public String getDeliveryID() {
        return DeliveryID;
    }

    public void setDeliveryID(String deliveryID) {
        DeliveryID = deliveryID;
    }

    public String getWayBillId() {
        return WayBillId;
    }

    public void setWayBillId(String wayBillId) {
        WayBillId = wayBillId;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public int getVersion() {
        return Version;
    }

    public void setVersion(int version) {
        Version = version;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public List<Action> getActions() {
        return Actions;
    }

    public void setActions(List<Action> actions) {
        Actions = actions;
    }
}
