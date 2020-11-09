package com.qq.weixin.api;

import java.nio.Buffer;
import java.util.HashMap;
import java.util.List;

public abstract class WeixinAPI {


    public static abstract class Response {
        private long errcode;
        private String errmsg;

        public long getErrcode() {
            return errcode;
        }

        public void setErrcode(long errcode) {
            this.errcode = errcode;
        }

        public String getErrmsg() {
            return errmsg;
        }

        public void setErrmsg(String errmsg) {
            this.errmsg = errmsg;
        }
    }

    //////////////////////////////////////////////////////
    public abstract cgi_bin$token_response cgi_bin$token(String grant_type,String appid,String secret);

    public static class cgi_bin$token_response extends Response{
        private String access_token;
        private long expires_in;

        public String getAccess_token() {
            return access_token;
        }

        public void setAccess_token(String access_token) {
            this.access_token = access_token;
        }

        public long getExpires_in() {
            return expires_in;
        }

        public void setExpires_in(long expires_in) {
            this.expires_in = expires_in;
        }


    }

    //////////////////////////////////////////////////////

    public abstract wxa$checksession_response wxa$checksession(String access_token,String openid,String signature,String sig_method);

    public static class wxa$checksession_response extends Response{

    }

    //////////////////////////////////////////////////////

    public abstract snc$jscode2session_response snc$jscode2session(String appid,String secret,String js_code,String grant_type);

    public static class snc$jscode2session_response extends Response{
        private String openid;
        private String session_key;
        private String unionid;

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getSession_key() {
            return session_key;
        }

        public void setSession_key(String session_key) {
            this.session_key = session_key;
        }

        public String getUnionid() {
            return unionid;
        }

        public void setUnionid(String unionid) {
            this.unionid = unionid;
        }

    }



    //////////////////////////////////////////////////////
    public static class wxa$img_sec_check_body{
        private Media media;

        public Media getMedia() {
            return media;
        }

        public void setMedia(Media media) {
            this.media = media;
        }
    }

    public abstract wxa$img_sec_check_response wxa$img_sec_check(String access_token,wxa$img_sec_check_body body);

    public static class wxa$img_sec_check_response extends Response{

    }

    //////////////////////////////////////////////////////
    public static class wxa$media_check_async_body{
        private String media_url;
        private String media_type;

        public String getMedia_url() {
            return media_url;
        }

        public void setMedia_url(String media_url) {
            this.media_url = media_url;
        }

        public String getMedia_type() {
            return media_type;
        }

        public void setMedia_type(String media_type) {
            this.media_type = media_type;
        }
    }

    public abstract wxa$media_check_async_response wxa$media_check_async(String access_token,wxa$media_check_async_body body);

    public static class wxa$media_check_async_response extends Response{
        private String trace_id;

        public String getTrace_id() {
            return trace_id;
        }

        public void setTrace_id(String trace_id) {
            this.trace_id = trace_id;
        }


    }

    //////////////////////////////////////////////////////
    public static class wxa$msg_sec_check_body{
        private String content;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public abstract wxa$msg_sec_check_response wxa$msg_sec_check(String access_token, wxa$msg_sec_check_body body);

    public static class wxa$msg_sec_check_response extends Response{

    }
    //////////////////////////////////////////////////////
    public static class wxa$remove_user_storage_body{
        private List<String> key;

        public List<String> getKey() {
            return key;
        }

        public void setKey(List<String> key) {
            this.key = key;
        }
    }

    public abstract wxa$remove_user_storage_response wxa$remove_user_storage(String access_token,String openid,String signature,String sig_method,wxa$remove_user_storage_body body);

    public static class wxa$remove_user_storage_response extends Response{

    }

    //////////////////////////////////////////////////////
    public static class wxa$setuserinteractivedata_body{
        private List<Kv> Kv_list;

        public List<Kv> getKv_list() {
            return Kv_list;
        }

        public void setKv_list(List<Kv> kv_list) {
            Kv_list = kv_list;
        }
    }

    public abstract wxa$setuserinteractivedata_response wxa$setuserinteractivedata(String access_token, String openid, String signature, String sig_method, wxa$setuserinteractivedata_body body);

    public static class wxa$setuserinteractivedata_response extends Response{

    }


    //////////////////////////////////////////////////////
    public static class wxa$set_user_storage_body{
        private List<Kv> Kv_list;

        public List<Kv> getKv_list() {
            return Kv_list;
        }

        public void setKv_list(List<Kv> kv_list) {
            Kv_list = kv_list;
        }
    }

    public abstract wxa$set_user_storage_response wxa$set_user_storage(String access_token, String openid, String signature, String sig_method, wxa$set_user_storage_body body);

    public static class wxa$set_user_storage_response extends Response{

    }

    //////////////////////////////////////////////////////

    public abstract cgi_bin$message$wxopen$activityid$create_response cgi_bin$message$wxopen$activityid$create(String access_token, String unionid);

    public static class cgi_bin$message$wxopen$activityid$create_response{
        private String activity_id;
        private long errcode;
        private long expiration_time;

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public long getErrcode() {
            return errcode;
        }

        public void setErrcode(long errcode) {
            this.errcode = errcode;
        }

        public long getExpiration_time() {
            return expiration_time;
        }

        public void setExpiration_time(long expiration_time) {
            this.expiration_time = expiration_time;
        }
    }

    //////////////////////////////////////////////////////
    public static class updatablemsg$send_body{
        private  String activity_id;
        private int target_state;
        private  List<Parameter> template_info;

        public String getActivity_id() {
            return activity_id;
        }

        public void setActivity_id(String activity_id) {
            this.activity_id = activity_id;
        }

        public int getTarget_state() {
            return target_state;
        }

        public void setTarget_state(int target_state) {
            this.target_state = target_state;
        }

        public List<Parameter> getTemplate_info() {
            return template_info;
        }

        public void setTemplate_info(List<Parameter> template_info) {
            this.template_info = template_info;
        }
    }

    public abstract cgi_bin$message$wxopen$updatablemsg$send_response cgi_bin$message$wxopen$updatablemsg$send(String access_token,updatablemsg$send_body body);

    public static class cgi_bin$message$wxopen$updatablemsg$send_response extends Response{

    }

    //////////////////////////////////////////////////////

    public static class wxaapp$createwxaqrcode_body{
        private String path;
        private  long width;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public long getWidth() {
            return width;
        }

        public void setWidth(long width) {
            this.width = width;
        }
    }

    public abstract cgi_bin$wxaapp$createwxaqrcode_response cgi_bin$wxaapp$createwxaqrcode(String access_token,wxaapp$createwxaqrcode_body body);

    public static class cgi_bin$wxaapp$createwxaqrcode_response extends Response{
        private Buffer iamge;

        public Buffer getIamge() {
            return iamge;
        }

        public void setIamge(Buffer iamge) {
            this.iamge = iamge;
        }


    }

    //////////////////////////////////////////////////////
    public static class wxa$getwxacode_body{
        private String path;
        private long width;
        private boolean auto_color;
        private GRB line_color;
        private boolean is_hyaline;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public long getWidth() {
            return width;
        }

        public void setWidth(long width) {
            this.width = width;
        }

        public boolean isAuto_color() {
            return auto_color;
        }

        public void setAuto_color(boolean auto_color) {
            this.auto_color = auto_color;
        }

        public GRB getLine_color() {
            return line_color;
        }

        public void setLine_color(GRB line_color) {
            this.line_color = line_color;
        }

        public boolean isIs_hyaline() {
            return is_hyaline;
        }

        public void setIs_hyaline(boolean is_hyaline) {
            this.is_hyaline = is_hyaline;
        }
    }

    public abstract wxa$getwxacode_response wxa$getwxacode(String access_token,wxa$getwxacode_body body);

    public static class wxa$getwxacode_response extends Response{

    }

    //////////////////////////////////////////////////////
    public static class wxa$getwxacodeunlimit_body{
        private String scene;
        private String page;
        private long width;
        private boolean auto_color;
        private GRB line_color;
        private boolean is_hyaline;

        public String getScene() {
            return scene;
        }

        public void setScene(String scene) {
            this.scene = scene;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public long getWidth() {
            return width;
        }

        public void setWidth(long width) {
            this.width = width;
        }

        public boolean isAuto_color() {
            return auto_color;
        }

        public void setAuto_color(boolean auto_color) {
            this.auto_color = auto_color;
        }

        public GRB getLine_color() {
            return line_color;
        }

        public void setLine_color(GRB line_GBcolor) {
            this.line_color = line_color;
        }

        public boolean isIs_hyaline() {
            return is_hyaline;
        }

        public void setIs_hyaline(boolean is_hyaline) {
            this.is_hyaline = is_hyaline;
        }
    }

    public abstract wxa$getwxacodeunlimit_response wxa$getwxacodeunlimit(String access_token,wxa$getwxacodeunlimit_body body);

    public static class wxa$getwxacodeunlimit_response extends Response{
        private Buffer iamge;

        public Buffer getIamge() {
            return iamge;
        }

        public void setIamge(Buffer iamge) {
            this.iamge = iamge;
        }


    }





    //////////////////////////////////////////////////////
    public static class subscribe$send_body{
        public static class data {
            public static class DataValue{
                private String value;

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }


        }
        private String touser;
        private String template_id;
        private String page;
        private HashMap<String, subscribe$send_body.data.DataValue> data;
        private String miniprogram_state;
        private String lang;

        public String getTouser() {
            return touser;
        }

        public void setTouser(String touser) {
            this.touser = touser;
        }

        public String getTemplate_id() {
            return template_id;
        }

        public void setTemplate_id(String template_id) {
            this.template_id = template_id;
        }

        public String getPage() {
            return page;
        }

        public void setPage(String page) {
            this.page = page;
        }

        public HashMap<String, subscribe$send_body.data.DataValue> getData() {
            return data;
        }

        public void setData(HashMap<String, subscribe$send_body.data.DataValue> data) {
            this.data = data;
        }

        public String getMiniprogram_state() {
            return miniprogram_state;
        }

        public void setMiniprogram_state(String miniprogram_state) {
            this.miniprogram_state = miniprogram_state;
        }

        public String getLang() {
            return lang;
        }

        public void setLang(String lang) {
            this.lang = lang;
        }
    }

    public abstract cgi_bin$message$subscribe$send_response cgi_bin$message$subscribe$send(String access_token,subscribe$send_body body);

    public static class cgi_bin$message$subscribe$send_response extends Response{

    }







}
