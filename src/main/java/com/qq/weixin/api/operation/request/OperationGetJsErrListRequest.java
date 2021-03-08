package com.qq.weixin.api.operation.request;

public class OperationGetJsErrListRequest {
    private String access_token;
    private String appVersion;
    private ErrType errType;
    private String startTime;
    private String endTime;
    private String keyword;
    private String openid;
    private Orderby orderby;
    private Desc desc;
    private int offset;
    private int limit;

    public enum Desc {
        zero(0),
        one(1);
        private int value;

        Desc(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public enum ErrType {
        zero(0),
        one(1),
        two(2),
        three(3);
        private int value;

        ErrType(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public enum Orderby{
        uv,
        pv
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public ErrType getErrType() {
        return errType;
    }

    public void setErrType(ErrType errType) {
        this.errType = errType;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }

    public Orderby getOrderby() {
        return orderby;
    }

    public void setOrderby(Orderby orderby) {
        this.orderby = orderby;
    }

    public Desc getDesc() {
        return desc;
    }

    public void setDesc(Desc desc) {
        this.desc = desc;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
