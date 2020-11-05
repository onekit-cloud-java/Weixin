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
    public static class wxa$remove_user_storage_body{
        private String key;

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }
    }

    public abstract wxa$remove_user_storage_response wxa$remove_user_storage(String access_token,String openid,String signature,String sig_method,wxa$remove_user_storage_body body);

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
    public static class wxa$setuserinteractivedata_body{
        private List<kv_list> Kv_list;

        public List<kv_list> getKv_list() {
            return Kv_list;
        }

        public void setKv_list(List<kv_list> kv_list) {
            Kv_list = kv_list;
        }
    }

    public abstract wxa$setuserinteractivedata_response wxa$setuserinteractivedata(String access_token, String openid, String signature, String sig_method, wxa$setuserinteractivedata_body body);

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
    public static class wxa$set_user_storage_body{
        private List<kv_list> Kv_list;

        public List<kv_list> getKv_list() {
            return Kv_list;
        }

        public void setKv_list(List<kv_list> kv_list) {
            Kv_list = kv_list;
        }
    }

    public abstract wxa$set_user_storage_response wxa$set_user_storage(String access_token, String openid, String signature, String sig_method, wxa$set_user_storage_body body);

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
        private  List<parameter_list> template_info;

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

        public List<parameter_list> getTemplate_info() {
            return template_info;
        }

        public void setTemplate_info(List<parameter_list> template_info) {
            this.template_info = template_info;
        }
    }

    public abstract cgi_bin$message$wxopen$updatablemsg$send_response cgi_bin$message$wxopen$updatablemsg$send(String access_token,updatablemsg$send_body body);

    public static class cgi_bin$message$wxopen$updatablemsg$send_response{
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

    public static class cgi_bin$wxaapp$createwxaqrcode_response{
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
    public static class wxa$getwxacode_body{
        private String path;
        private long width;
        private boolean auto_color;
        private line_color line_color;
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

        public com.qq.weixin.api.line_color getLine_color() {
            return line_color;
        }

        public void setLine_color(com.qq.weixin.api.line_color line_color) {
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
    public static class wxa$getwxacodeunlimit_body{
        private String scene;
        private String page;
        private long width;
        private boolean auto_color;
        private line_color line_color;
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

        public com.qq.weixin.api.line_color getLine_color() {
            return line_color;
        }

        public void setLine_color(com.qq.weixin.api.line_color line_color) {
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
    public static class datacube$getgameanalysisdata_body{
        private String metric;
        private long granularity;
        private long start_time;
        private long end_time;
        private filter_list filter_list;
        private List<String> group_list;

        public String getMetric() {
            return metric;
        }

        public void setMetric(String metric) {
            this.metric = metric;
        }

        public long getGranularity() {
            return granularity;
        }

        public void setGranularity(long granularity) {
            this.granularity = granularity;
        }

        public long getStart_time() {
            return start_time;
        }

        public void setStart_time(long start_time) {
            this.start_time = start_time;
        }

        public long getEnd_time() {
            return end_time;
        }

        public void setEnd_time(long end_time) {
            this.end_time = end_time;
        }

        public com.qq.weixin.api.filter_list getFilter_list() {
            return filter_list;
        }

        public void setFilter_list(com.qq.weixin.api.filter_list filter_list) {
            this.filter_list = filter_list;
        }

        public List<String> getGroup_list() {
            return group_list;
        }

        public void setGroup_list(List<String> group_list) {
            this.group_list = group_list;
        }
    }

    public abstract datacube$getgameanalysisdata_response datacube$getgameanalysisdata(String access_token,datacube$getgameanalysisdata_body body);

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
    public static class wxa$createwxagameroom_body{
        private long game_tick;
        private List<String> open_id_list;
        private long udp_reliability_strategy;
        private long end_time;
        private long start_percent;
        private boolean need_user_info;
        private long game_last_time;
        private String room_ext_info;
        private boolean need_game_seed;

        public long getGame_tick() {
            return game_tick;
        }

        public void setGame_tick(long game_tick) {
            this.game_tick = game_tick;
        }

        public List<String> getOpen_id_list() {
            return open_id_list;
        }

        public void setOpen_id_list(List<String> open_id_list) {
            this.open_id_list = open_id_list;
        }

        public long getUdp_reliability_strategy() {
            return udp_reliability_strategy;
        }

        public void setUdp_reliability_strategy(long udp_reliability_strategy) {
            this.udp_reliability_strategy = udp_reliability_strategy;
        }

        public long getEnd_time() {
            return end_time;
        }

        public void setEnd_time(long end_time) {
            this.end_time = end_time;
        }

        public long getStart_percent() {
            return start_percent;
        }

        public void setStart_percent(long start_percent) {
            this.start_percent = start_percent;
        }

        public boolean isNeed_user_info() {
            return need_user_info;
        }

        public void setNeed_user_info(boolean need_user_info) {
            this.need_user_info = need_user_info;
        }

        public long getGame_last_time() {
            return game_last_time;
        }

        public void setGame_last_time(long game_last_time) {
            this.game_last_time = game_last_time;
        }

        public String getRoom_ext_info() {
            return room_ext_info;
        }

        public void setRoom_ext_info(String room_ext_info) {
            this.room_ext_info = room_ext_info;
        }

        public boolean isNeed_game_seed() {
            return need_game_seed;
        }

        public void setNeed_game_seed(boolean need_game_seed) {
            this.need_game_seed = need_game_seed;
        }
    }

    public abstract wxa$createwxagameroom_response wxa$createwxagameroom(String access_token,wxa$createwxagameroom_body body);

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
    public static class subscribe$send_body{
        private String touser;
        private String template_id;
        private String page;
        private data data;
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

        public com.qq.weixin.api.data getData() {
            return data;
        }

        public void setData(com.qq.weixin.api.data data) {
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

    public static class cgi_bin$message$subscribe$send_response{
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
