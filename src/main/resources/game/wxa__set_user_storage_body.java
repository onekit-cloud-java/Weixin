package com.qq.weixin.api.entity;

import java.util.List;
@SuppressWarnings("unused")
public class wxa__set_user_storage_body {
    private List<KV<String>> Kv_list;

    public List<KV<String>> getKv_list() {
        return Kv_list;
    }

    public void setKv_list(List<KV<String>> kv_list) {
        Kv_list = kv_list;
    }
}
