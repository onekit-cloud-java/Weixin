package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class GetPerformanceDataRequest {
    private String access_token;
    private Time time;
    private Params params;
    public enum module{

        module_10016("10016"),
        module_10017("10017"),
        module_10021("10021"),
        module_10022("10022"),
        module_10023("10023");

        private String module;

        module(String number) {
            this.module = number;
        }

        public String getModule() {
            return module;
        }

        public void setModule(String module) {
            this.module = module;
        }
    }

    public static class Time{
        private String end_timestamp;
        private String begin_timestamp;

        public String getEnd_timestamp() {
            return end_timestamp;
        }

        public void setEnd_timestamp(String end_timestamp) {
            this.end_timestamp = end_timestamp;
        }

        public String getBegin_timestamp() {
            return begin_timestamp;
        }

        public void setBegin_timestamp(String begin_timestamp) {
            this.begin_timestamp = begin_timestamp;
        }
    }

    public static class Params{
        private String value;
        public enum field{
            networktype,
            device_level,
            device,
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

}
