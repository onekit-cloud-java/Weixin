package com.qq.weixin.api;

import com.qq.weixin.api.Security.request.ImgSecCheckRequest;
import com.qq.weixin.api.Security.request.MediaCheckAsyncRequest;
import com.qq.weixin.api.Security.request.MsgSecCheckRequest;
import com.qq.weixin.api.Security.response.MediaCheckAsyncResponse;

public interface WeixinSecurityAPI {
    void imgSecCheck(ImgSecCheckRequest imgSecCheckRequest) throws WeixinError;

    MediaCheckAsyncResponse mediaCheckAsync(MediaCheckAsyncRequest mediaCheckAsyncRequest)throws WeixinError;

    void msgSecCheck(MsgSecCheckRequest msgSecCheckRequest)throws WeixinError;
}
