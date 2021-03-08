package com.qq.weixin.api.operation.request;

public class OperationGetJsErrDetailRequest {
    private String access_token;
    private String startTime;
    private String endTime;
    private String errorMsgMd5;
    private String errorStackMd5;
    private String appVersion;
    private String sdkVersion;
    private OsName osName;
    private String clientVersion;
    private String openid;
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

    public enum OsName {
        zero(0),
        one(1),
        two(2),
        three(3);
        private int value;

        OsName(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
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

    public String getErrorMsgMd5() {
        return errorMsgMd5;
    }

    public void setErrorMsgMd5(String errorMsgMd5) {
        this.errorMsgMd5 = errorMsgMd5;
    }

    public String getErrorStackMd5() {
        return errorStackMd5;
    }

    public void setErrorStackMd5(String errorStackMd5) {
        this.errorStackMd5 = errorStackMd5;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    public String getSdkVersion() {
        return sdkVersion;
    }

    public void setSdkVersion(String sdkVersion) {
        this.sdkVersion = sdkVersion;
    }

    public OsName getOsName() {
        return osName;
    }

    public void setOsName(OsName osName) {
        this.osName = osName;
    }

    public String getClientVersion() {
        return clientVersion;
    }

    public void setClientVersion(String clientVersion) {
        this.clientVersion = clientVersion;
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
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
