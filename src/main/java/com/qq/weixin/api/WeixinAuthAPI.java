package com.qq.weixin.api;

import cn.onekit.thekit.SIGN;
import com.qq.weixin.api.Auth.request.GetAccessTokenRequest;
import com.qq.weixin.api.Auth.response.GetAccessTokenResponse;
import com.qq.weixin.api.Auth.request.Code2SessionRequest;
import com.qq.weixin.api.Auth.request.GetPaidUnionIdRequest;
import com.qq.weixin.api.Auth.response.Code2SessionResponse;
import com.qq.weixin.api.Auth.response.GetPaidUnionIdResponse;

public interface WeixinAuthAPI {
    default String _signBody(String wx_sig_method, String wx_session_key, String wx_body) throws Exception {
        SIGN.Method method;
        if ("hmac_sha256".equals(wx_sig_method)) {
            method = SIGN.Method.HMACSHA256;
        } else {
            throw new Exception(wx_sig_method);
        }
        return new SIGN(method).sign(wx_session_key, wx_body);
    }
    default String _signRaw(String wx_rawData,String wx_session_key) throws Exception {
        return new SIGN(SIGN.Method.SHA1).sign(wx_rawData+wx_session_key);
    }

    Code2SessionResponse code2Session(Code2SessionRequest code2SessionRequest) throws WeixinError;

    GetPaidUnionIdResponse getPaidUnionId(GetPaidUnionIdRequest getPaidUnionIdRequest) throws WeixinError;

    GetAccessTokenResponse getAccessToken(GetAccessTokenRequest getAccessTokenRequest) throws WeixinError;
}
