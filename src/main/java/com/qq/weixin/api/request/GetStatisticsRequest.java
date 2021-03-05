package com.qq.weixin.api.request;

public class GetStatisticsRequest {
    private String access_token;
    private Action action;
    private int begin_date;
    private int end_date;
    private int page_offset;
    private int page_limit;
    private Condition condition;

    public enum Action{
        smsMarketingOverviewData,
        smsMarketingConversionData,
        smsMarketingRealTimeData
    }
    public static class Condition{
        private String env_id;
        private String activity_id;
        private String by_channel_id;

        public String getEnv_id() {
            return env_id;
        }

        public void setEnv_id(String env_id) {
            this.env_id = env_id;
        }

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public String getBy_channel_id() {
            return by_channel_id;
        }

        public void setBy_channel_id(String by_channel_id) {
            this.by_channel_id = by_channel_id;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public int getBegin_date() {
        return begin_date;
    }

    public void setBegin_date(int begin_date) {
        this.begin_date = begin_date;
    }

    public int getEnd_date() {
        return end_date;
    }

    public void setEnd_date(int end_date) {
        this.end_date = end_date;
    }

    public int getPage_offset() {
        return page_offset;
    }

    public void setPage_offset(int page_offset) {
        this.page_offset = page_offset;
    }

    public int getPage_limit() {
        return page_limit;
    }

    public void setPage_limit(int page_limit) {
        this.page_limit = page_limit;
    }

    public Condition getCondition() {
        return condition;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }
}
