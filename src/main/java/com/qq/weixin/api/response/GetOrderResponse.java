package com.qq.weixin.api.response;

public class GetOrderResponse {
    private int order_status;
    private String waybill_id;
    private String rider_name;
    private String rider_phone;
    private int rider_lng;
    private int rider_lat;
    private int reach_time;

    public int getOrder_status() {
        return order_status;
    }

    public void setOrder_status(int order_status) {
        this.order_status = order_status;
    }

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public String getRider_name() {
        return rider_name;
    }

    public void setRider_name(String rider_name) {
        this.rider_name = rider_name;
    }

    public String getRider_phone() {
        return rider_phone;
    }

    public void setRider_phone(String rider_phone) {
        this.rider_phone = rider_phone;
    }

    public int getRider_lng() {
        return rider_lng;
    }

    public void setRider_lng(int rider_lng) {
        this.rider_lng = rider_lng;
    }

    public int getRider_lat() {
        return rider_lat;
    }

    public void setRider_lat(int rider_lat) {
        this.rider_lat = rider_lat;
    }

    public int getReach_time() {
        return reach_time;
    }

    public void setReach_time(int reach_time) {
        this.reach_time = reach_time;
    }
}
