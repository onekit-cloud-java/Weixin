package com.qq.weixin.api.entity;

import java.util.HashMap;
@SuppressWarnings("unused")
public  class cgi_bin__message__subscribe__send_body{
    public static class Data {
        public static class DataValue{
            private String value;


            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }


    }
    private String touser;
    private String template_id;
    private String page;
    private HashMap<String, Data.DataValue> data;
    private String miniprogram_state;
    private String lang;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public HashMap<String, Data.DataValue> getData() {
        return data;
    }

    public void setData(HashMap<String, Data.DataValue> data) {
        this.data = data;
    }

    public String getMiniprogram_state() {
        return miniprogram_state;
    }

    public void setMiniprogram_state(String miniprogram_state) {
        this.miniprogram_state = miniprogram_state;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }
}