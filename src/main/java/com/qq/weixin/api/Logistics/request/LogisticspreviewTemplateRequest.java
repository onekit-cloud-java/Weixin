package com.qq.weixin.api.Logistics.request;

import java.util.List;

public class LogisticspreviewTemplateRequest {
    private String access_token;
    private String waybill_id;
    private String waybill_template;
    private String waybill_data;
    private Custom custom;

    public static class Custom{
        private String delivery_token;
        private String shopid;
        private String shop_order_id;
        private String shop_no;
        private String delivery_sign;
        private String delivery_id;
        private String openid;
        private Sender sender;
        private Receiver receiver;
        private Cargo cargo;
        private Orderinfo order_info;
        private Shop shop;
        private String sub_biz_id;

        public static class Sender{
            private String name;
            private String city;
            private String address;
            private String address_detail;
            private String phone;
            private int lng;
            private int lat;
            private int coordinate_type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getAddress_detail() {
                return address_detail;
            }

            public void setAddress_detail(String address_detail) {
                this.address_detail = address_detail;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getLng() {
                return lng;
            }

            public void setLng(int lng) {
                this.lng = lng;
            }

            public int getLat() {
                return lat;
            }

            public void setLat(int lat) {
                this.lat = lat;
            }

            public int getCoordinate_type() {
                return coordinate_type;
            }

            public void setCoordinate_type(int coordinate_type) {
                this.coordinate_type = coordinate_type;
            }
        }

        public static class Receiver{
            private String name;
            private String city;
            private String address;
            private String address_detail;
            private String phone;
            private int lng;
            private int lat;
            private int coordinate_type;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getAddress_detail() {
                return address_detail;
            }

            public void setAddress_detail(String address_detail) {
                this.address_detail = address_detail;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            public int getLng() {
                return lng;
            }

            public void setLng(int lng) {
                this.lng = lng;
            }

            public int getLat() {
                return lat;
            }

            public void setLat(int lat) {
                this.lat = lat;
            }

            public int getCoordinate_type() {
                return coordinate_type;
            }

            public void setCoordinate_type(int coordinate_type) {
                this.coordinate_type = coordinate_type;
            }
        }

        public static class Cargo{
            private String goods_pickup_info;
            private String goods_delivery_info;
            private String cargo_first_class;
            private String cargo_second_class;
            private Cargo.Goodsdetail goods_detail;
            private int goods_value;
            private int goods_height;
            private int goods_length;
            private int goods_width;
            private int goods_weight;

            public static class Goodsdetail{
                private List<Cargo.Goodsdetail.Goods> goods;

                public static class Goods{
                    private int good_count;
                    private String good_name;
                    private int good_price;
                    private String good_unit;

                    public int getGood_count() {
                        return good_count;
                    }

                    public void setGood_count(int good_count) {
                        this.good_count = good_count;
                    }

                    public String getGood_name() {
                        return good_name;
                    }

                    public void setGood_name(String good_name) {
                        this.good_name = good_name;
                    }

                    public int getGood_price() {
                        return good_price;
                    }

                    public void setGood_price(int good_price) {
                        this.good_price = good_price;
                    }

                    public String getGood_unit() {
                        return good_unit;
                    }

                    public void setGood_unit(String good_unit) {
                        this.good_unit = good_unit;
                    }
                }

                public List<Cargo.Goodsdetail.Goods> getGoods() {
                    return goods;
                }

                public void setGoods(List<Cargo.Goodsdetail.Goods> goods) {
                    this.goods = goods;
                }
            }

            public String getGoods_pickup_info() {
                return goods_pickup_info;
            }

            public void setGoods_pickup_info(String goods_pickup_info) {
                this.goods_pickup_info = goods_pickup_info;
            }

            public String getGoods_delivery_info() {
                return goods_delivery_info;
            }

            public void setGoods_delivery_info(String goods_delivery_info) {
                this.goods_delivery_info = goods_delivery_info;
            }

            public String getCargo_first_class() {
                return cargo_first_class;
            }

            public void setCargo_first_class(String cargo_first_class) {
                this.cargo_first_class = cargo_first_class;
            }

            public String getCargo_second_class() {
                return cargo_second_class;
            }

            public void setCargo_second_class(String cargo_second_class) {
                this.cargo_second_class = cargo_second_class;
            }

            public Cargo.Goodsdetail getGoods_detail() {
                return goods_detail;
            }

            public void setGoods_detail(Cargo.Goodsdetail goods_detail) {
                this.goods_detail = goods_detail;
            }

            public int getGoods_value() {
                return goods_value;
            }

            public void setGoods_value(int goods_value) {
                this.goods_value = goods_value;
            }

            public int getGoods_height() {
                return goods_height;
            }

            public void setGoods_height(int goods_height) {
                this.goods_height = goods_height;
            }

            public int getGoods_length() {
                return goods_length;
            }

            public void setGoods_length(int goods_length) {
                this.goods_length = goods_length;
            }

            public int getGoods_width() {
                return goods_width;
            }

            public void setGoods_width(int goods_width) {
                this.goods_width = goods_width;
            }

            public int getGoods_weight() {
                return goods_weight;
            }

            public void setGoods_weight(int goods_weight) {
                this.goods_weight = goods_weight;
            }
        }

        public static class Orderinfo{
            private String delivery_service_code;
            private int order_type;
            private int expected_delivery_time;
            private int expected_finish_time;
            private int expected_pick_time;
            private String poi_seq;
            private String note;
            private int order_time;
            private int is_insured;
            private int declared_value;
            private int tips;
            private int is_direct_delivery;
            private int cash_on_delivery;
            private int cash_on_pickup;
            private int rider_pick_method;
            private int is_finish_code_needed;
            private int is_pickup_code_needed;

            public String getDelivery_service_code() {
                return delivery_service_code;
            }

            public void setDelivery_service_code(String delivery_service_code) {
                this.delivery_service_code = delivery_service_code;
            }

            public int getOrder_type() {
                return order_type;
            }

            public void setOrder_type(int order_type) {
                this.order_type = order_type;
            }

            public int getExpected_delivery_time() {
                return expected_delivery_time;
            }

            public void setExpected_delivery_time(int expected_delivery_time) {
                this.expected_delivery_time = expected_delivery_time;
            }

            public int getExpected_finish_time() {
                return expected_finish_time;
            }

            public void setExpected_finish_time(int expected_finish_time) {
                this.expected_finish_time = expected_finish_time;
            }

            public int getExpected_pick_time() {
                return expected_pick_time;
            }

            public void setExpected_pick_time(int expected_pick_time) {
                this.expected_pick_time = expected_pick_time;
            }

            public String getPoi_seq() {
                return poi_seq;
            }

            public void setPoi_seq(String poi_seq) {
                this.poi_seq = poi_seq;
            }

            public String getNote() {
                return note;
            }

            public void setNote(String note) {
                this.note = note;
            }

            public int getOrder_time() {
                return order_time;
            }

            public void setOrder_time(int order_time) {
                this.order_time = order_time;
            }

            public int getIs_insured() {
                return is_insured;
            }

            public void setIs_insured(int is_insured) {
                this.is_insured = is_insured;
            }

            public int getDeclared_value() {
                return declared_value;
            }

            public void setDeclared_value(int declared_value) {
                this.declared_value = declared_value;
            }

            public int getTips() {
                return tips;
            }

            public void setTips(int tips) {
                this.tips = tips;
            }

            public int getIs_direct_delivery() {
                return is_direct_delivery;
            }

            public void setIs_direct_delivery(int is_direct_delivery) {
                this.is_direct_delivery = is_direct_delivery;
            }

            public int getCash_on_delivery() {
                return cash_on_delivery;
            }

            public void setCash_on_delivery(int cash_on_delivery) {
                this.cash_on_delivery = cash_on_delivery;
            }

            public int getCash_on_pickup() {
                return cash_on_pickup;
            }

            public void setCash_on_pickup(int cash_on_pickup) {
                this.cash_on_pickup = cash_on_pickup;
            }

            public int getRider_pick_method() {
                return rider_pick_method;
            }

            public void setRider_pick_method(int rider_pick_method) {
                this.rider_pick_method = rider_pick_method;
            }

            public int getIs_finish_code_needed() {
                return is_finish_code_needed;
            }

            public void setIs_finish_code_needed(int is_finish_code_needed) {
                this.is_finish_code_needed = is_finish_code_needed;
            }

            public int getIs_pickup_code_needed() {
                return is_pickup_code_needed;
            }

            public void setIs_pickup_code_needed(int is_pickup_code_needed) {
                this.is_pickup_code_needed = is_pickup_code_needed;
            }
        }

        public static class Shop{
            private String wxa_path;
            private String img_url;
            private String goods_name;
            private String goods_count;
            private String wxa_appid;

            public String getWxa_path() {
                return wxa_path;
            }

            public void setWxa_path(String wxa_path) {
                this.wxa_path = wxa_path;
            }

            public String getImg_url() {
                return img_url;
            }

            public void setImg_url(String img_url) {
                this.img_url = img_url;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public String getGoods_count() {
                return goods_count;
            }

            public void setGoods_count(String goods_count) {
                this.goods_count = goods_count;
            }

            public String getWxa_appid() {
                return wxa_appid;
            }

            public void setWxa_appid(String wxa_appid) {
                this.wxa_appid = wxa_appid;
            }
        }


        public String getDelivery_token() {
            return delivery_token;
        }

        public void setDelivery_token(String delivery_token) {
            this.delivery_token = delivery_token;
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

        public String getDelivery_sign() {
            return delivery_sign;
        }

        public void setDelivery_sign(String delivery_sign) {
            this.delivery_sign = delivery_sign;
        }

        public String getDelivery_id() {
            return delivery_id;
        }

        public void setDelivery_id(String delivery_id) {
            this.delivery_id = delivery_id;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public Sender getSender() {
            return sender;
        }

        public void setSender(Sender sender) {
            this.sender = sender;
        }

        public Receiver getReceiver() {
            return receiver;
        }

        public void setReceiver(Receiver receiver) {
            this.receiver = receiver;
        }

        public Cargo getCargo() {
            return cargo;
        }

        public void setCargo(Cargo cargo) {
            this.cargo = cargo;
        }

        public Orderinfo getOrder_info() {
            return order_info;
        }

        public void setOrder_info(Orderinfo order_info) {
            this.order_info = order_info;
        }

        public Shop getShop() {
            return shop;
        }

        public void setShop(Shop shop) {
            this.shop = shop;
        }

        public String getSub_biz_id() {
            return sub_biz_id;
        }

        public void setSub_biz_id(String sub_biz_id) {
            this.sub_biz_id = sub_biz_id;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public String getWaybill_template() {
        return waybill_template;
    }

    public void setWaybill_template(String waybill_template) {
        this.waybill_template = waybill_template;
    }

    public String getWaybill_data() {
        return waybill_data;
    }

    public void setWaybill_data(String waybill_data) {
        this.waybill_data = waybill_data;
    }

    public Custom getCustom() {
        return custom;
    }

    public void setCustom(Custom custom) {
        this.custom = custom;
    }
}
