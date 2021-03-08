package com.qq.weixin.api.operation.response;

import java.util.List;

public class OperationGetFeedbackResponse {
    private int total_num;
    private List<Feedbacklist> list;
    public static class Feedbacklist{
        private String record_id;
        private long create_time;
        private String content;
        private long phone;
        private String openid;
        private String nickname;
        private String head_url;
        private int type;
        private List<String> mediaIds;
        private String systemInfo;

        public String getRecord_id() {
            return record_id;
        }

        public void setRecord_id(String record_id) {
            this.record_id = record_id;
        }

        public long getCreate_time() {
            return create_time;
        }

        public void setCreate_time(long create_time) {
            this.create_time = create_time;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public long getPhone() {
            return phone;
        }

        public void setPhone(long phone) {
            this.phone = phone;
        }

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getHead_url() {
            return head_url;
        }

        public void setHead_url(String head_url) {
            this.head_url = head_url;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public List<String> getMediaIds() {
            return mediaIds;
        }

        public void setMediaIds(List<String> mediaIds) {
            this.mediaIds = mediaIds;
        }

        public String getSystemInfo() {
            return systemInfo;
        }

        public void setSystemInfo(String systemInfo) {
            this.systemInfo = systemInfo;
        }
    }

    public int getTotal_num() {
        return total_num;
    }

    public void setTotal_num(int total_num) {
        this.total_num = total_num;
    }

    public List<Feedbacklist> getList() {
        return list;
    }

    public void setList(List<Feedbacklist> list) {
        this.list = list;
    }
}
