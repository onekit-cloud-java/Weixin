package com.qq.weixin.api.response;


@SuppressWarnings("unused")
public class GetPaidUnionIdResponse extends WeixinResponse {
    private String unionid;

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }
}
