package com.qq.weixin.api.Cloudbase.request;

public class ReportRequest {
    private String report_action;
    private String env_id;
    private String activity_id;
    private String task_id;
    private String phone_count;
    private String channel_id;
    private String session_id;

    public String getReport_action() {
        return report_action;
    }

    public void setReport_action(String report_action) {
        this.report_action = report_action;
    }

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

    public String getTask_id() {
        return task_id;
    }

    public void setTask_id(String task_id) {
        this.task_id = task_id;
    }

    public String getPhone_count() {
        return phone_count;
    }

    public void setPhone_count(String phone_count) {
        this.phone_count = phone_count;
    }

    public String getChannel_id() {
        return channel_id;
    }

    public void setChannel_id(String channel_id) {
        this.channel_id = channel_id;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }
}
