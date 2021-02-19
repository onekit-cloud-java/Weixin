package com.qq.weixin.api.response;


import java.util.ArrayList;
@SuppressWarnings("unused")
public class GetDailySummaryResponse {

    private ArrayList<list> list;

    public static class list{
        private String ref_date;
        private int visit_total;
        private int share_pv;
        private int share_uv;

        public String getRef_date() {
            return ref_date;
        }

        public void setRef_date(String ref_date) {
            this.ref_date = ref_date;
        }

        public int getVisit_total() {
            return visit_total;
        }

        public void setVisit_total(int visit_total) {
            this.visit_total = visit_total;
        }

        public int getShare_pv() {
            return share_pv;
        }

        public void setShare_pv(int share_pv) {
            this.share_pv = share_pv;
        }

        public int getShare_uv() {
            return share_uv;
        }

        public void setShare_uv(int share_uv) {
            this.share_uv = share_uv;
        }
    }

    public ArrayList<GetDailySummaryResponse.list> getList() {
        return list;
    }

    public void setList(ArrayList<GetDailySummaryResponse.list> list) {
        this.list = list;
    }
}
