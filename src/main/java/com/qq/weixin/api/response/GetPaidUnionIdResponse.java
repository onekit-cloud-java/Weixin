package com.qq.weixin.api.response;

public class GetPaidUnionIdResponse extends WeixinError{
    private String unionid;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
