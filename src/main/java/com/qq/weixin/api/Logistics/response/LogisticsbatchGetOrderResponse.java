package com.qq.weixin.api.Logistics.response;

import java.util.List;

public class LogisticsbatchGetOrderResponse {
    private List<Order> order_list;
    private int order_status;

    public static class Order{
        private int errcode;
        private String errmsg;
        private String order_id;
        private String delivery_id;
        private String waybill_id;
        private String print_html;
        private List<WaybillData> waybill_data;
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

        public String getPrint_html() {
            return print_html;
        }

        public void setPrint_html(String print_html) {
            this.print_html = print_html;
        }

        public List<WaybillData> getWaybill_data() {
            return waybill_data;
        }

        public void setWaybill_data(List<WaybillData> waybill_data) {
            this.waybill_data = waybill_data;
        }
    }

    public List<Order> getOrder_list() {
        return order_list;
    }

    public void setOrder_list(List<Order> order_list) {
        this.order_list = order_list;
    }

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }
}
