package com.qq.weixin.api.operation.response;


import java.util.List;

public class OperationGetJsErrDetailResponse {
    private List<Data> data;
    private int totalCount;
    public static class Data{
        private String Count;
        private String sdkVersion;
        private String ClientVersion;
        private String errorStackMd5;
        private String TimeStamp;
        private String appVersion;
        private String errorMsgMd5;
        private OsName osName;
        private String errorStack;
        private String Ds;
        private Desc desc;
        private String openId;
        private String pluginversion;
        private String appId;
        private String DeviceModel;
        private String source;
        private String route;
        private String Uin;
        private String nickname;
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

        public String getCount() {
            return Count;
        }

        public void setCount(String count) {
            Count = count;
        }

        public String getSdkVersion() {
            return sdkVersion;
        }

        public void setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
        }

        public String getClientVersion() {
            return ClientVersion;
        }

        public void setClientVersion(String clientVersion) {
            ClientVersion = clientVersion;
        }

        public String getErrorStackMd5() {
            return errorStackMd5;
        }

        public void setErrorStackMd5(String errorStackMd5) {
            this.errorStackMd5 = errorStackMd5;
        }

        public String getTimeStamp() {
            return TimeStamp;
        }

        public void setTimeStamp(String timeStamp) {
            TimeStamp = timeStamp;
        }

        public String getAppVersion() {
            return appVersion;
        }

        public void setAppVersion(String appVersion) {
            this.appVersion = appVersion;
        }

        public String getErrorMsgMd5() {
            return errorMsgMd5;
        }

        public void setErrorMsgMd5(String errorMsgMd5) {
            this.errorMsgMd5 = errorMsgMd5;
        }

        public OsName getOsName() {
            return osName;
        }

        public void setOsName(OsName osName) {
            this.osName = osName;
        }

        public String getErrorStack() {
            return errorStack;
        }

        public void setErrorStack(String errorStack) {
            this.errorStack = errorStack;
        }

        public String getDs() {
            return Ds;
        }

        public void setDs(String ds) {
            Ds = ds;
        }

        public Desc getDesc() {
            return desc;
        }

        public void setDesc(Desc desc) {
            this.desc = desc;
        }

        public String getOpenId() {
            return openId;
        }

        public void setOpenId(String openId) {
            this.openId = openId;
        }

        public String getPluginversion() {
            return pluginversion;
        }

        public void setPluginversion(String pluginversion) {
            this.pluginversion = pluginversion;
        }

        public String getAppId() {
            return appId;
        }

        public void setAppId(String appId) {
            this.appId = appId;
        }

        public String getDeviceModel() {
            return DeviceModel;
        }

        public void setDeviceModel(String deviceModel) {
            DeviceModel = deviceModel;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getRoute() {
            return route;
        }

        public void setRoute(String route) {
            this.route = route;
        }

        public String getUin() {
            return Uin;
        }

        public void setUin(String uin) {
            Uin = uin;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
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
