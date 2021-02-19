package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class UniformsendRequest {
    private String access_token;
    private String touser;
    private Weapp_template_msg weapp_template_msg;
    private Mp_template_msg mp_template_msg;

    public static class Weapp_template_msg{
        private String template_id;
        private String page;
        private String form_id;
        private String data;
        private String emphasis_keyword;

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

        public String getForm_id() {
            return form_id;
        }

        public void setForm_id(String form_id) {
            this.form_id = form_id;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }

        public String getEmphasis_keyword() {
            return emphasis_keyword;
        }

        public void setEmphasis_keyword(String emphasis_keyword) {
            this.emphasis_keyword = emphasis_keyword;
        }
    }

    public static class Mp_template_msg{
        private String appid;
        private String template_id;
        private String url;
        private String miniprogram;
        private String data;

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getTemplate_id() {
            return template_id;
        }

        public void setTemplate_id(String template_id) {
            this.template_id = template_id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMiniprogram() {
            return miniprogram;
        }

        public void setMiniprogram(String miniprogram) {
            this.miniprogram = miniprogram;
        }

        public String getData() {
            return data;
        }

        public void setData(String data) {
            this.data = data;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public Weapp_template_msg getWeapp_template_msg() {
        return weapp_template_msg;
    }

    public void setWeapp_template_msg(Weapp_template_msg weapp_template_msg) {
        this.weapp_template_msg = weapp_template_msg;
    }

    public Mp_template_msg getMp_template_msg() {
        return mp_template_msg;
    }

    public void setMp_template_msg(Mp_template_msg mp_template_msg) {
        this.mp_template_msg = mp_template_msg;
    }
}
