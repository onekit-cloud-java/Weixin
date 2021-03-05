package com.qq.weixin.api.response;

import java.util.List;

public class GetAllImmeDeliveryResponse {
    private List<Delivery> list;

    public static class Delivery{
        private String delivery_id;
        private String delivery_name;

        public String getDelivery_id() {
            return delivery_id;
        }

        public void setDelivery_id(String delivery_id) {
            this.delivery_id = delivery_id;
        }

        public String getDelivery_name() {
            return delivery_name;
        }

        public void setDelivery_name(String delivery_name) {
            this.delivery_name = delivery_name;
        }
    }

    public List<Delivery> getList() {
        return list;
    }

    public void setList(List<Delivery> list) {
        this.list = list;
    }
}
