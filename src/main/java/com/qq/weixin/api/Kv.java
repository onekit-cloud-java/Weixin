package com.qq.weixin.api;

import java.io.Serializable;

public class Kv implements Serializable {
    public Kv(String key, String value){
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
