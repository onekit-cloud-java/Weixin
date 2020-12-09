package com.qq.weixin.api.entity;

import java.util.List;
@SuppressWarnings("unused")
public class updatablemsg__send_body {
    private  String activity_id;
    private int target_state;
    private List<Parameter> template_info;

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public int getTarget_state() {
        return target_state;
    }

    public void setTarget_state(int target_state) {
        this.target_state = target_state;
    }

    public List<Parameter> getTemplate_info() {
        return template_info;
    }

    public void setTemplate_info(List<Parameter> template_info) {
        this.template_info = template_info;
    }
}
