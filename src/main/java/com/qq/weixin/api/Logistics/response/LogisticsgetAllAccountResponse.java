package com.qq.weixin.api.Logistics.response;

import java.util.List;

public class LogisticsgetAllAccountResponse {
    private int errcode;
    private String errmsg;
    private int count;
    private List<AllAccountList> list;

    public static class AllAccountList{
        private String biz_id;
        private String delivery_id;
        private String create_time;
        private String update_time;
        private Statuscode status_code;
        private String alias;
        private String remark_wrong_msg;
        private String remark_content;
        private String quota_num;
        private String quota_update_time;
        private List<Servicetype> service_type;

        public static class Servicetype{
            private int service_type;
            private String service_name;

            public int getService_type() {
                return service_type;
            }

            public void setService_type(int service_type) {
                this.service_type = service_type;
            }

            public String getService_name() {
                return service_name;
            }

            public void setService_name(String service_name) {
                this.service_name = service_name;
            }
        }

        public enum Statuscode{
            zero(0),
            one(1),
            two(2),
            three(3);
            private int value;

            Statuscode(int i) {
                this.value = i;
            }

            public int getValue() {
                return value;
            }

            public void setValue(int value) {
                this.value = value;
            }
        }

        public String getBiz_id() {
            return biz_id;
        }

        public void setBiz_id(String biz_id) {
            this.biz_id = biz_id;
        }

        public String getDelivery_id() {
            return delivery_id;
        }

        public void setDelivery_id(String delivery_id) {
            this.delivery_id = delivery_id;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public String getUpdate_time() {
            return update_time;
        }

        public void setUpdate_time(String update_time) {
            this.update_time = update_time;
        }

        public Statuscode getStatus_code() {
            return status_code;
        }

        public void setStatus_code(Statuscode status_code) {
            this.status_code = status_code;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getRemark_wrong_msg() {
            return remark_wrong_msg;
        }

        public void setRemark_wrong_msg(String remark_wrong_msg) {
            this.remark_wrong_msg = remark_wrong_msg;
        }

        public String getRemark_content() {
            return remark_content;
        }

        public void setRemark_content(String remark_content) {
            this.remark_content = remark_content;
        }

        public String getQuota_num() {
            return quota_num;
        }

        public void setQuota_num(String quota_num) {
            this.quota_num = quota_num;
        }

        public String getQuota_update_time() {
            return quota_update_time;
        }

        public void setQuota_update_time(String quota_update_time) {
            this.quota_update_time = quota_update_time;
        }

        public List<Servicetype> getService_type() {
            return service_type;
        }

        public void setService_type(List<Servicetype> service_type) {
            this.service_type = service_type;
        }
    }

    public int getErrcode() {
        return errcode;
    }

    public void setErrcode(int errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<AllAccountList> getList() {
        return list;
    }

    public void setList(List<AllAccountList> list) {
        this.list = list;
    }
}
