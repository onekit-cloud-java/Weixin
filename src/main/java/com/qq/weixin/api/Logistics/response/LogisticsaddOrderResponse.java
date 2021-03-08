package com.qq.weixin.api.Logistics.response;

import java.util.List;

public class LogisticsaddOrderResponse {
    private String order_id;
    private String waybill_id;
    private List<WaybillData> waybill_data;
    private int errcode;
    private String errmsg;
    private int delivery_resultcode;
    private String delivery_resultmsg;

    public static class WaybillData{
        private String key;
        private String value;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public List<WaybillData> getWaybill_data() {
        return waybill_data;
    }

    public void setWaybill_data(List<WaybillData> waybill_data) {
        this.waybill_data = waybill_data;
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getDelivery_resultcode() {
        return delivery_resultcode;
    }

    public void setDelivery_resultcode(int delivery_resultcode) {
        this.delivery_resultcode = delivery_resultcode;
    }

    public String getDelivery_resultmsg() {
        return delivery_resultmsg;
    }

    public void setDelivery_resultmsg(String delivery_resultmsg) {
        this.delivery_resultmsg = delivery_resultmsg;
    }
}
