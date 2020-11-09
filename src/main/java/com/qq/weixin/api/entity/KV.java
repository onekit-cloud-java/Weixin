package com.qq.weixin.api.entity;

import java.io.Serializable;

public class KV implements Serializable {
    public KV(String key, String value){
        this.key=key;
        this.value=value;
    }
    private String key, value;

    public String getKey() {
        return key;
    }
    public String getValue() {
        return value;
    }
}
