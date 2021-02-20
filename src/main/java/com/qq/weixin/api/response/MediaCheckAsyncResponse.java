package com.qq.weixin.api.response;


@SuppressWarnings("unused")
public class MediaCheckAsyncResponse extends WeixinResponse {
    private String trace_id;

    public String getTrace_id() {
        return trace_id;
    }

    public void setTrace_id(String trace_id) {
        this.trace_id = trace_id;
    }
}
