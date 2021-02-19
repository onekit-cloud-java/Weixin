package com.qq.weixin.api.request;

public class GenerateRequest {
    private String access_token;
    private Jump_wxa jump_wxa;
    private boolean is_expire;
    private Long expire_time;

    public static class Jump_wxa{
        private String path;
        private String query;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getQuery() {
            return query;
        }

        public void setQuery(String query) {
            this.query = query;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Jump_wxa getJump_wxa() {
        return jump_wxa;
    }

    public void setJump_wxa(Jump_wxa jump_wxa) {
        this.jump_wxa = jump_wxa;
    }

    public boolean isIs_expire() {
        return is_expire;
    }

    public void setIs_expire(boolean is_expire) {
        this.is_expire = is_expire;
    }

    public Long getExpire_time() {
        return expire_time;
    }

    public void setExpire_time(Long expire_time) {
        this.expire_time = expire_time;
    }
}
