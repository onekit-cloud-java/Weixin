package com.qq.weixin.api.response;
@SuppressWarnings("unused")
public class GetWeeklyRetainResponse {
    private String ref_date;
    private GetMonthlyRetainResponse.Visit_uv_new visit_uv_new;
    private GetMonthlyRetainResponse.Visit_uv visit_uv;


    public static class Visit_uv{
        private int key;
        private int value;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }

    public static class Visit_uv_new{
        private int key;
        private int value;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public GetMonthlyRetainResponse.Visit_uv_new getVisit_uv_new() {
        return visit_uv_new;
    }

    public void setVisit_uv_new(GetMonthlyRetainResponse.Visit_uv_new visit_uv_new) {
        this.visit_uv_new = visit_uv_new;
    }

    public GetMonthlyRetainResponse.Visit_uv getVisit_uv() {
        return visit_uv;
    }

    public void setVisit_uv(GetMonthlyRetainResponse.Visit_uv visit_uv) {
        this.visit_uv = visit_uv;
    }
}
