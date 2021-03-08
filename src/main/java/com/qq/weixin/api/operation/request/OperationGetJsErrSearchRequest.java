package com.qq.weixin.api.operation.request;

public class OperationGetJsErrSearchRequest {
    private String access_token;
    private String errmsg_keyword;
    private int type;
    private String client_version;
    private int start_time;
    private int end_time;
    private int start;
    private int limit;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getErrmsg_keyword() {
        return errmsg_keyword;
    }

    public void setErrmsg_keyword(String errmsg_keyword) {
        this.errmsg_keyword = errmsg_keyword;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getClient_version() {
        return client_version;
    }

    public void setClient_version(String client_version) {
        this.client_version = client_version;
    }

    public int getStart_time() {
        return start_time;
    }

    public void setStart_time(int start_time) {
        this.start_time = start_time;
    }

    public int getEnd_time() {
        return end_time;
    }

    public void setEnd_time(int end_time) {
        this.end_time = end_time;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
