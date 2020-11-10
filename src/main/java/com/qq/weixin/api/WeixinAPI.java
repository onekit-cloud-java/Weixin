package com.qq.weixin.api;

import com.qq.weixin.api.entity.*;

public interface  WeixinAPI {

     String _crypto(String sig_method, String session_key, String data) throws Exception;
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

    cgi_bin__wxaapp__createwxaqrcode_response cgi_bin__wxaapp__createwxaqrcode(String access_token, wxaapp__createwxaqrcode_body body);

    WeixinResponse wxa__getwxacode(String access_token, wxa__getwxacode_body body);

    wxa__getwxacodeunlimit_response wxa__getwxacodeunlimit(String access_token, wxa__getwxacodeunlimit_body body);

    WeixinResponse cgi_bin__message__subscribe__send(String access_token, subscribe__send_body body);
}
