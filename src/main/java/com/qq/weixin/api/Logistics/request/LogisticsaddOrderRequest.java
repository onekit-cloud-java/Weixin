package com.qq.weixin.api.Logistics.request;

import java.util.List;

public class LogisticsaddOrderRequest {
    private String access_token;
    private int add_source;
    private String wx_appid;
    private String order_id;
    private String openid;
    private String biz_id;
    private String delivery_id;
    private String custom_remark;
    private int tagid;
    private Sender sender;
    private Receiver receiver;
    private Cargo cargo;
    private Insured insured;
    private Service service;
    private Shop shop;
    private long expect_time;

    public static class Sender{
        private String name;
        private String tel;
        private String mobile;
        private String company;
        private String post_code;
        private String country;
        private String province;
        private String city;
        private String area;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getPost_code() {
            return post_code;
        }

        public void setPost_code(String post_code) {
            this.post_code = post_code;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Receiver{
        private String name;
        private String tel;
        private String mobile;
        private String company;
        private String post_code;
        private String country;
        private String province;
        private String city;
        private String area;
        private String address;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getTel() {
            return tel;
        }

        public void setTel(String tel) {
            this.tel = tel;
        }

        public String getMobile() {
            return mobile;
        }

        public void setMobile(String mobile) {
            this.mobile = mobile;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

        public String getPost_code() {
            return post_code;
        }

        public void setPost_code(String post_code) {
            this.post_code = post_code;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class Cargo{
        private int count;
        private int weight;
        private int space_x;
        private int space_y;
        private int space_z;
        private List<Detail> detail_list;

        public static class Detail{
            private String name;
            private int count;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }


        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public int getSpace_x() {
            return space_x;
        }

        public void setSpace_x(int space_x) {
            this.space_x = space_x;
        }

        public int getSpace_y() {
            return space_y;
        }

        public void setSpace_y(int space_y) {
            this.space_y = space_y;
        }

        public int getSpace_z() {
            return space_z;
        }

        public void setSpace_z(int space_z) {
            this.space_z = space_z;
        }

        public List<Detail> getDetail_list() {
            return detail_list;
        }

        public void setDetail_list(List<Detail> detail_list) {
            this.detail_list = detail_list;
        }
    }

    public static class Shop{
        private String wxa_path;
        private String img_url;
        private String goods_name;
        private String goods_count;


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

    }

    public static class Insured {
        private int use_insured;
        private int insured_value;

        public int getUse_insured() {
            return use_insured;
        }

        public void setUse_insured(int use_insured) {
            this.use_insured = use_insured;
        }

        public int getInsured_value() {
            return insured_value;
        }

        public void setInsured_value(int insured_value) {
            this.insured_value = insured_value;
        }
    }

    public static class Service  {
        private int service_type;
        private String service_name;

        public int getService_type() {
            return service_type;
        }

        public void setService_type(int service_type) {
            this.service_type = service_type;
        }

        public String getService_name() {
            return service_name;
        }

        public void setService_name(String service_name) {
            this.service_name = service_name;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getAdd_source() {
        return add_source;
    }

    public void setAdd_source(int add_source) {
        this.add_source = add_source;
    }

    public String getWx_appid() {
        return wx_appid;
    }

    public void setWx_appid(String wx_appid) {
        this.wx_appid = wx_appid;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public String getBiz_id() {
        return biz_id;
    }

    public void setBiz_id(String biz_id) {
        this.biz_id = biz_id;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getCustom_remark() {
        return custom_remark;
    }

    public void setCustom_remark(String custom_remark) {
        this.custom_remark = custom_remark;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
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

    public Insured getInsured() {
        return insured;
    }

    public void setInsured(Insured insured) {
        this.insured = insured;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public long getExpect_time() {
        return expect_time;
    }

    public void setExpect_time(long expect_time) {
        this.expect_time = expect_time;
    }
}
