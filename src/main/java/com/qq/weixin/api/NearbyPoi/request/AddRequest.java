package com.qq.weixin.api.NearbyPoi.request;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
public class AddRequest {
    private String access_token;
    private final String is_comm_nearby = "1";
    private String pic_list;
    private String service_infos;
    private String kf_info;
    private String store_name;
    private String hour;
    private String address;
    private String poi_id;
    private String company_name;
    private String contract_phone;
    private String credential;
    private String qualification_list;
    private String map_poi_id;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getIs_comm_nearby() {
        return is_comm_nearby;
    }

    public String getPic_list() {
        return pic_list;
    }

    public void setPic_list(String pic_list) {
        this.pic_list = pic_list;
    }

    public String getService_infos() {
        return service_infos;
    }

    public void setService_infos(String service_infos) {
        this.service_infos = service_infos;
    }

    public String getKf_info() {
        return kf_info;
    }

    public void setKf_info(String kf_info) {
        this.kf_info = kf_info;
    }

    public String getStore_name() {
        return store_name;
    }

    public void setStore_name(String store_name) {
        this.store_name = store_name;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPoi_id() {
        return poi_id;
    }

    public void setPoi_id(String poi_id) {
        this.poi_id = poi_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getContract_phone() {
        return contract_phone;
    }

    public void setContract_phone(String contract_phone) {
        this.contract_phone = contract_phone;
    }

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    public String getQualification_list() {
        return qualification_list;
    }

    public void setQualification_list(String qualification_list) {
        this.qualification_list = qualification_list;
    }

    public String getMap_poi_id() {
        return map_poi_id;
    }

    public void setMap_poi_id(String map_poi_id) {
        this.map_poi_id = map_poi_id;
    }
}
