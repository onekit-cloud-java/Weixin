package com.qq.weixin.api;

import cn.onekit.thekit.SIGN;
import com.qq.weixin.api.entity.*;

public interface  WeixinAPI {

    public default String _signBody(String sig_method, String session_key, String body) throws Exception {
        SIGN.Method method;
        switch (sig_method) {
            case "hmac_sha256":
                method = SIGN.Method.HMACSHA256;
                break;
            default:
                throw new Exception(sig_method);
        }
        return new SIGN(method).sign(session_key, body);
    }
    public default String _signRaw(String rawData,String session_key) throws Exception {
        return new SIGN(SIGN.Method.SHA1).sign( rawData+session_key);
    }
    cgi_bin__token_response cgi_bin__token(String grant_type, String appid, String secret) throws WeixinError;

    WeixinResponse wxa__checksession(String access_token, String openid, String signature, String sig_method, String body);

    snc__jscode2session_response snc__jscode2session(String appid, String secret, String js_code, String grant_type);

    WeixinResponse wxa__img_sec_check(String access_token, wxa__img_sec_check_body body);

    wxa__media_check_async_response wxa__media_check_async(String access_token, wxa__media_check_async_body body);

    WeixinResponse wxa__msg_sec_check(String access_token, wxa__msg_sec_check_body body);

    WeixinResponse wxa__remove_user_storage(String access_token, String openid, String signature, String sig_method, wxa__remove_user_storage_body body);

    WeixinResponse wxa__setuserinteractivedata(String access_token, String openid, String signature, String sig_method, wxa__setuserinteractivedata_body body);

    WeixinResponse wxa__set_user_storage(String access_token, String openid, String signature, String sig_method, wxa__set_user_storage_body body);

    cgi_bin__message__wxopen__activityid__create_response cgi_bin__message__wxopen__activityid__create(String access_token, String unionid);

    WeixinResponse cgi_bin__message__wxopen__updatablemsg__send(String access_token, updatablemsg__send_body body);

    byte[] cgi_bin__wxaapp__createwxaqrcode(String access_token, wxaapp__createwxaqrcode_body body) throws WeixinError;

    byte[] wxa__getwxacode(String access_token, wxa__getwxacode_body body)throws WeixinError;

    byte[] wxa__getwxacodeunlimit(String access_token, wxa__getwxacodeunlimit_body body)throws WeixinError;

    WeixinResponse cgi_bin__message__subscribe__send(String access_token, subscribe__send_body body);
}
