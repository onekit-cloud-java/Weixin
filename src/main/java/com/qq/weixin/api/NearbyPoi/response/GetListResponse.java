package com.qq.weixin.api.NearbyPoi.response;


@SuppressWarnings("unused")
public class GetListResponse {
    private Data data;

    public static class Data{
        private int left_apply_num;
        private int max_apply_num;
        private String data;

        public int getLeft_apply_num() {
            return left_apply_num;
        }

        public void setLeft_apply_num(int left_apply_num) {
            this.left_apply_num = left_apply_num;
        }

        public int getMax_apply_num() {
            return max_apply_num;
        }

        public void setMax_apply_num(int max_apply_num) {
            this.max_apply_num = max_apply_num;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }
}
