package com.qq.weixin.api.entity;

import java.util.List;

public class wxa__setuserinteractivedata_body {
    private List<KV<Integer>> Kv_list;

    public List<KV<Integer>> getKv_list() {
        return Kv_list;
    }

    public void setKv_list(List<KV<Integer>> kv_list) {
        Kv_list = kv_list;
    }
}
