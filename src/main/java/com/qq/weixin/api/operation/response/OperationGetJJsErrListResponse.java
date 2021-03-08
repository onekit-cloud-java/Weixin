package com.qq.weixin.api.operation.response;

import java.util.List;

public class OperationGetJJsErrListResponse {
    private List<Data> data;
    private int totalCount;
    public static class Data{
        private String uv;
        private String pv;
        private String pvPercent;
        private String uvPercent;

        public String getUv() {
            return uv;
        }

        public void setUv(String uv) {
            this.uv = uv;
        }

        public String getPv() {
            return pv;
        }

        public void setPv(String pv) {
            this.pv = pv;
        }

        public String getPvPercent() {
            return pvPercent;
        }

        public void setPvPercent(String pvPercent) {
            this.pvPercent = pvPercent;
        }

        public String getUvPercent() {
            return uvPercent;
        }

        public void setUvPercent(String uvPercent) {
            this.uvPercent = uvPercent;
        }
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
}
