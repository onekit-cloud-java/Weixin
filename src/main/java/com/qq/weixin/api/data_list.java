package com.qq.weixin.api;

public class data_list {
    private long timestamp;
    private String time_label;
    private group_dimension_list group_dimension_list;
    private long metric_value;

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getTime_label() {
        return time_label;
    }

    public void setTime_label(String time_label) {
        this.time_label = time_label;
    }

    public com.qq.weixin.api.group_dimension_list getGroup_dimension_list() {
        return group_dimension_list;
    }

    public void setGroup_dimension_list(com.qq.weixin.api.group_dimension_list group_dimension_list) {
        this.group_dimension_list = group_dimension_list;
    }

    public long getMetric_value() {
        return metric_value;
    }

    public void setMetric_value(long metric_value) {
        this.metric_value = metric_value;
    }
}
