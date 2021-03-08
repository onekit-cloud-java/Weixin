package com.qq.weixin.api;

import com.qq.weixin.api.Wxacode.request.CreateQRCodeRequest;
import com.qq.weixin.api.Wxacode.request.GetRequest;
import com.qq.weixin.api.Wxacode.request.GetUnlimitedRequest;

public interface WeixinWxacodeAPI {
    byte[] createQRCode(CreateQRCodeRequest createQRCodeRequest) throws WeixinError;

    byte[] get(GetRequest getRequest) throws WeixinError;

    byte[] getUnlimited(GetUnlimitedRequest getUnlimitedRequest) throws WeixinError;
}
