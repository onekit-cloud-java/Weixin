package com.qq.weixin.api.operation.response;

import java.util.List;

public class OperationGetJsErrSearchResponse {
    private List<Result> results;
    private int total;
    public static class Result{
        private long time;
        private String client_version;
        private String app_version;
        private int version_error_cnt;
        private int total_error_cnt;
        private String errmsg;

        public long getTime() {
            return time;
        }

        public void setTime(long time) {
            this.time = time;
        }

        public String getClient_version() {
            return client_version;
        }

        public void setClient_version(String client_version) {
            this.client_version = client_version;
        }

        public String getApp_version() {
            return app_version;
        }

        public void setApp_version(String app_version) {
            this.app_version = app_version;
        }

        public int getVersion_error_cnt() {
            return version_error_cnt;
        }

        public void setVersion_error_cnt(int version_error_cnt) {
            this.version_error_cnt = version_error_cnt;
        }

        public int getTotal_error_cnt() {
            return total_error_cnt;
        }

        public void setTotal_error_cnt(int total_error_cnt) {
            this.total_error_cnt = total_error_cnt;
        }

        public String getErrmsg() {
            return errmsg;
        }

        public void setErrmsg(String errmsg) {
            this.errmsg = errmsg;
        }
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
