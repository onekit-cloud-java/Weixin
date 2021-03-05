package com.qq.weixin.api.response;

import java.util.List;

public class GetBindAccountResponse {
    private List<Shop> shop_list;
    public static class Shop{
        private String delivery_id;
        private String shopid;
        private  int audit_result;

        public String getDelivery_id() {
            return delivery_id;
        }

        public void setDelivery_id(String delivery_id) {
            this.delivery_id = delivery_id;
        }

        public String getShopid() {
            return shopid;
        }

        public void setShopid(String shopid) {
            this.shopid = shopid;
        }

        public int getAudit_result() {
            return audit_result;
        }

        public void setAudit_result(int audit_result) {
            this.audit_result = audit_result;
        }
    }

    public List<Shop> getShop_list() {
        return shop_list;
    }

    public void setShop_list(List<Shop> shop_list) {
        this.shop_list = shop_list;
    }
}
