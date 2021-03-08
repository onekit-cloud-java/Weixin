package com.qq.weixin.api.Logistics.request;

import java.util.List;

public class LogisticsbatchGetOrderRequest {
    private String access_token;
    private List<Orderlist> order_list;
    public static  class Orderlist{
         private String order_id;
        private String delivery_id;
        private String waybill_id;

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
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public List<Orderlist> getOrder_list() {
        return order_list;
    }

    public void setOrder_list(List<Orderlist> order_list) {
        this.order_list = order_list;
    }
}
