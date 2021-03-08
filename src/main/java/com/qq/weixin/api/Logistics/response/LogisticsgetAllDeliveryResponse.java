package com.qq.weixin.api.Logistics.response;

import java.util.List;

public class LogisticsgetAllDeliveryResponse {
    private int count;
    private List<Data> data;
    public static class Data{
        private String delivery_id;
        private String delivery_name;
        private int can_use_cash;
        private int can_get_quota;
        private String cash_biz_id;
        private List<Servicetype> service_type;

        public static class Servicetype{
            private String service_name;
            private int service_type;

            public String getService_name() {
                return service_name;
            }

            public void setService_name(String service_name) {
                this.service_name = service_name;
            }

            public int getService_type() {
                return service_type;
            }

            public void setService_type(int service_type) {
                this.service_type = service_type;
            }
        }

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

        public int getCan_use_cash() {
            return can_use_cash;
        }

        public void setCan_use_cash(int can_use_cash) {
            this.can_use_cash = can_use_cash;
        }

        public int getCan_get_quota() {
            return can_get_quota;
        }

        public void setCan_get_quota(int can_get_quota) {
            this.can_get_quota = can_get_quota;
        }

        public String getCash_biz_id() {
            return cash_biz_id;
        }

        public void setCash_biz_id(String cash_biz_id) {
            this.cash_biz_id = cash_biz_id;
        }

        public List<Servicetype> getService_type() {
            return service_type;
        }

        public void setService_type(List<Servicetype> service_type) {
            this.service_type = service_type;
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
