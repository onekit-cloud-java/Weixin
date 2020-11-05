package com.qq.weixin.api;

import java.nio.Buffer;

public class Media {
    private String contentType;
    private Buffer value;

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Buffer getValue() {
        return value;
    }

    public void setValue(Buffer value) {
        this.value = value;
    }
}
