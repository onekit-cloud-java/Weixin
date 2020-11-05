package com.qq.weixin.api;

import java.io.Serializable;
import java.nio.Buffer;
import java.util.List;

public abstract class WeixinAPI {


    //////////////////////////////////////////////////////
    public abstract cgi_bin$token_response cgi_bin$token(String grant_type,String appid,String secret);

    public static class cgi_bin$token_response implements Serializable{
        private String access_token;
        private long expires_in;
        private long errcode;
        private String errmsg;

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

    public abstract snc$jscode2session_response snc$jscode2session(String appid,String secret,String js_code,String grant_type);

    public static class snc$jscode2session_response{
        private String openid;
        private String session_key;
        private String unionid;
        private long errcode;
        private String errmsg;

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

    public abstract wxa$checksession_response wxa$checksession(String access_token,String openid,String signature,String sig_method);

    public static class wxa$checksession_response{
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

    public abstract wxa$img_sec_check_response wxa$img_sec_check(String access_token, Media media);

    public static class wxa$img_sec_check_response{
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
    public abstract wxa$media_check_async_response wxa$media_check_async(String access_token,String media_url,String media_type);

    public static class wxa$media_check_async_response{
        private String trace_id;
        private long errcode;
        private String errmsg;

        public String getTrace_id() {
            return trace_id;
        }

        public void setTrace_id(String trace_id) {
            this.trace_id = trace_id;
        }

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

    public abstract wxa$msg_sec_check_response wxa$msg_sec_check(String access_token,String content);

    public static class wxa$msg_sec_check_response{
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

    public abstract wxa$remove_user_storage_response wxa$remove_user_storage(String access_token,String openid,String signature,String sig_method,String key);

    public static class wxa$remove_user_storage_response{
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

    public abstract wxa$setuserinteractivedata_response wxa$setuserinteractivedata(String access_token, String openid, String signature, String sig_method, List<kv_list> Kv_list);

    public static class wxa$setuserinteractivedata_response{
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

    public abstract wxa$set_user_storage_response wxa$set_user_storage(String access_token, String openid, String signature, String sig_method, List<kv_list> Kv_list);

    public static class wxa$set_user_storage_response{
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

    public abstract activityid$create_response activityid$create(String access_token, String unionid);

    public static class activityid$create_response{
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

    public abstract updatablemsg$send_response updatablemsg$send(String access_token, String activity_id,int target_state,List<parameter_list> template_info);

    public static class updatablemsg$send_response{
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

    public abstract wxaapp$createwxaqrcode_response wxaapp$createwxaqrcode(String access_token, String path,long width);

    public static class wxaapp$createwxaqrcode_response{
        private Buffer iamge;
        private long errcode;
        private String errmsg;

        public Buffer getIamge() {
            return iamge;
        }

        public void setIamge(Buffer iamge) {
            this.iamge = iamge;
        }

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

    public abstract wxa$getwxacode_response wxa$getwxacode(String access_token, String path,long width,boolean auto_color,line_color line_color,boolean is_hyaline);

    public static class wxa$getwxacode_response{
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

    public abstract wxa$getwxacodeunlimit_response wxa$getwxacodeunlimit(String access_token, String scene,String page,long width,boolean auto_color,line_color line_color,boolean is_hyaline);

    public static class wxa$getwxacodeunlimit_response{
        private Buffer iamge;
        private long errcode;
        private String errmsg;

        public Buffer getIamge() {
            return iamge;
        }

        public void setIamge(Buffer iamge) {
            this.iamge = iamge;
        }

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

    public abstract datacube$getgameanalysisdata_response datacube$getgameanalysisdata(String metric, long granularity,long start_time,long end_time,filter_list filter_list,List<String> group_list,String access_token);

    public static class datacube$getgameanalysisdata_response{
        private long errcode;
        private String errmsg;
        private data_list data_list;



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

    public abstract wxa$createwxagameroom_response wxa$createwxagameroom(String access_token, long game_tick,List<String> open_id_list,long udp_reliability_strategy,
                                                                         long start_percent,boolean need_user_info,long game_last_time,String room_ext_info,boolean need_game_seed);

    public static class wxa$createwxagameroom_response{
        private long errcode;
        private String errmsg;
        private data data;

        public com.qq.weixin.api.data getData() {
            return data;
        }

        public void setData(com.qq.weixin.api.data data) {
            this.data = data;
        }

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

    public abstract wxa$getwxagameframe_response wxa$getwxagameframe(String access_token,String access_info,long begin_frame_id, long end_frame_id);

    public static class wxa$getwxagameframe_response{
        private long errcode;
        private String errmsg;
        private data data;

        public com.qq.weixin.api.data getData() {
            return data;
        }

        public void setData(com.qq.weixin.api.data data) {
            this.data = data;
        }

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

    public abstract wxa$getwxagameidentityinfo_response wxa$getwxagameidentityinfo(String access_token,String access_info);

    public static class wxa$getwxagameidentityinfo_response{
        private long errcode;
        private String errmsg;
        private data data;

        public com.qq.weixin.api.data getData() {
            return data;
        }

        public void setData(com.qq.weixin.api.data data) {
            this.data = data;
        }

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

    public abstract wxa$getwxagameroominfo_response wxa$getwxagameroominfo(String access_token,String access_info);

    public static class wxa$getwxagameroominfo_response{
        private long errcode;
        private String errmsg;
        private data data;

        public com.qq.weixin.api.data getData() {
            return data;
        }

        public void setData(com.qq.weixin.api.data data) {
            this.data = data;
        }

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

    public abstract subscribe$send_response subscribe$send(String access_token,String touser,String template_id,String page,data data,String miniprogram_state,String lang);

    public static class subscribe$send_response{
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











}
