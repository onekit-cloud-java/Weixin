package com.qq.weixin.api;

import cn.onekit.thekit.SIGN;
import com.qq.weixin.api.entity.*;

public interface  WeixinAPI {

    public default String _signBody(String wx_sig_method, String wx_session_key, String wx_body) throws Exception {
        SIGN.Method method;
        switch (wx_sig_method) {
            case "hmac_sha256":
                method = SIGN.Method.HMACSHA256;
                break;
            default:
                throw new Exception(wx_sig_method);
        }
        return new SIGN(method).sign(wx_session_key, wx_body);
    }
    public default String _signRaw(String wx_rawData,String wx_session_key) throws Exception {
        return new SIGN(SIGN.Method.SHA1).sign( wx_rawData+wx_session_key);
    }
    cgi_bin__token_response cgi_bin__token(String wx_grant_type, String wx_appid, String wx_secret) throws WeixinError;

    WeixinResponse wxa__checksession(String wx_access_token, String wx_openid, String wx_signature, String wx_sig_method, String wx_body);

    snc__jscode2session_response snc__jscode2session(String wx_appid, String wx_secret, String wx_js_code, String wx_grant_type);

    WeixinResponse wxa__img_sec_check(String wx_access_token, byte[] wx_body);

    wxa__media_check_async_response wxa__media_check_async(String wx_access_token, wxa__media_check_async_body wx_body);

    WeixinResponse wxa__msg_sec_check(String wx_access_token, wxa__msg_sec_check_body wx_body);

    WeixinResponse wxa__remove_user_storage(String wx_access_token, String wx_openid, String wx_signature, String wx_sig_method, wxa__remove_user_storage_body wx_body);

    WeixinResponse wxa__setuserinteractivedata(String wx_access_token, String wx_openid, String wx_signature, String wx_sig_method, wxa__setuserinteractivedata_body wx_body);

    WeixinResponse wxa__set_user_storage(String wx_access_token, String wx_openid, String wx_signature, String wx_sig_method, wxa__set_user_storage_body wx_body);

    cgi_bin__message__wxopen__activityid__create_response cgi_bin__message__wxopen__activityid__create(String wx_access_token, String unionid);

    WeixinResponse cgi_bin__message__wxopen__updatablemsg__send(String wx_access_token, updatablemsg__send_body wx_body);

    byte[] cgi_bin__wxaapp__createwxaqrcode(String wx_access_token, wxaapp__createwxaqrcode_body wx_body) throws WeixinError;

    byte[] wxa__getwxacode(String wx_access_token, wxa__getwxacode_body wx_body)throws WeixinError;

    byte[] wxa__getwxacodeunlimit(String wx_access_token, wxa__getwxacodeunlimit_body wx_body)throws WeixinError;

    WeixinResponse cgi_bin__message__subscribe__send(String wx_access_token, subscribe__send_body wx_body);
}
