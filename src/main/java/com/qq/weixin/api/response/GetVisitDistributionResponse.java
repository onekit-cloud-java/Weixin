package com.qq.weixin.api.response;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class GetVisitDistributionResponse {
    private String ref_date;
    private ArrayList<List> list;

    public static class List{
        public enum index{
            access_source_session_cnt,
            access_staytime_info,
            access_depth_info
        }
        private ArrayList<Item_list> item_list;

        public static class Item_list{
            private int key;
            private int value;
            private int access_source_visit_uv;

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

            public int getAccess_source_visit_uv() {
                return access_source_visit_uv;
            }

            public void setAccess_source_visit_uv(int access_source_visit_uv) {
                this.access_source_visit_uv = access_source_visit_uv;
            }
        }

        public ArrayList<Item_list> getItem_list() {
            return item_list;
        }

        public void setItem_list(ArrayList<Item_list> item_list) {
            this.item_list = item_list;
        }
    }

    public String getRef_date() {
        return ref_date;
    }

    public void setRef_date(String ref_date) {
        this.ref_date = ref_date;
    }

    public ArrayList<List> getList() {
        return list;
    }

    public void setList(ArrayList<List> list) {
        this.list = list;
    }
}
