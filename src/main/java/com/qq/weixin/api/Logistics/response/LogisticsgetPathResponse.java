package com.qq.weixin.api.Logistics.response;

import java.util.List;

public class LogisticsgetPathResponse {
    private String openid;
    private String delivery_id;
    private String waybill_id;
    private int path_item_num;
    private List<Pathitems> path_item_list;
    public static class Pathitems{
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

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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

    public int getPath_item_num() {
        return path_item_num;
    }

    public void setPath_item_num(int path_item_num) {
        this.path_item_num = path_item_num;
    }

    public List<Pathitems> getPath_item_list() {
        return path_item_list;
    }

    public void setPath_item_list(List<Pathitems> path_item_list) {
        this.path_item_list = path_item_list;
    }
}
