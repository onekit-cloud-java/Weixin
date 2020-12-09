package com.qq.weixin.api.entity;


@SuppressWarnings("unused")
public class KV <T> {
    public KV(String key, T value){
        this.key=key;
        this.value=value;
    }
    private String key;
    private T value;

    public String getKey() {
        return key;
    }
    public T getValue() {
        return value;
    }
}
