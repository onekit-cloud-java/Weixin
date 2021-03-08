package com.qq.weixin.api.DataAnalysis.response;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class GetMonthlyVisitTrendResponse {
    private ArrayList<GetDailySummaryResponse.list> list;

    public static class list{
        private String ref_date;
        private int session_cnt;
        private int visit_pv;
        private int visit_uv;
        private int visit_uv_new;
        private int stay_time_uv;
        private int stay_time_session;
        private int visit_depth;

        public String getRef_date() {
            return ref_date;
        }

        public void setRef_date(String ref_date) {
            this.ref_date = ref_date;
        }

        public int getSession_cnt() {
            return session_cnt;
        }

        public void setSession_cnt(int session_cnt) {
            this.session_cnt = session_cnt;
        }

        public int getVisit_pv() {
            return visit_pv;
        }

        public void setVisit_pv(int visit_pv) {
            this.visit_pv = visit_pv;
        }

        public int getVisit_uv() {
            return visit_uv;
        }

        public void setVisit_uv(int visit_uv) {
            this.visit_uv = visit_uv;
        }

        public int getVisit_uv_new() {
            return visit_uv_new;
        }

        public void setVisit_uv_new(int visit_uv_new) {
            this.visit_uv_new = visit_uv_new;
        }

        public int getStay_time_uv() {
            return stay_time_uv;
        }

        public void setStay_time_uv(int stay_time_uv) {
            this.stay_time_uv = stay_time_uv;
        }

        public int getStay_time_session() {
            return stay_time_session;
        }

        public void setStay_time_session(int stay_time_session) {
            this.stay_time_session = stay_time_session;
        }

        public int getVisit_depth() {
            return visit_depth;
        }

        public void setVisit_depth(int visit_depth) {
            this.visit_depth = visit_depth;
        }
    }

    public ArrayList<GetDailySummaryResponse.list> getList() {
        return list;
    }

    public void setList(ArrayList<GetDailySummaryResponse.list> list) {
        this.list = list;
    }
}
