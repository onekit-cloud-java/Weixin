package com.qq.weixin.api.response;
@SuppressWarnings("unused")
public class GetVoIPSignResponse extends WeixinResponse{
    private String signature;

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
