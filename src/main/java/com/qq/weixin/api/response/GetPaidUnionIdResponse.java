package com.qq.weixin.api.response;

import com.qq.weixin.api.WeixinError;
@SuppressWarnings("unused")
public class GetPaidUnionIdResponse extends WeixinError {
    private String unionid;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
