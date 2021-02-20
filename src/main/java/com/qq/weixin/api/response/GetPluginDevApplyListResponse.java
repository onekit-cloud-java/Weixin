package com.qq.weixin.api.response;


import java.util.ArrayList;
@SuppressWarnings("unused")
public class GetPluginDevApplyListResponse extends WeixinResponse {
    private ArrayList<Apply_list> apply_list;

    public static class Apply_list{
        private String appid;
        private String headimgurl;
        private String nickname;
        private String create_time;
        private ArrayList<Categories> categories;
        private String apply_url;
        private String reason;

        public enum status{
            status1(1),
            status2(2),
            status3(3),
            status4(4);
            private final int status;

            public int getStatus() {
                return status;
            }

            status(int num) {
                this.status = num;
            }

        }

        public static class Categories{
            private String first;
            private String second;
            private String third;

            public String getFirst() {
                return first;
            }

            public void setFirst(String first) {
                this.first = first;
            }

            public String getSecond() {
                return second;
            }

            public void setSecond(String second) {
                this.second = second;
            }

            public String getThird() {
                return third;
            }

            public void setThird(String third) {
                this.third = third;
            }
        }

        public String getAppid() {
            return appid;
        }

        public void setAppid(String appid) {
            this.appid = appid;
        }

        public String getHeadimgurl() {
            return headimgurl;
        }

        public void setHeadimgurl(String headimgurl) {
            this.headimgurl = headimgurl;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getCreate_time() {
            return create_time;
        }

        public void setCreate_time(String create_time) {
            this.create_time = create_time;
        }

        public ArrayList<Categories> getCategories() {
            return categories;
        }

        public void setCategories(ArrayList<Categories> categories) {
            this.categories = categories;
        }

        public String getApply_url() {
            return apply_url;
        }

        public void setApply_url(String apply_url) {
            this.apply_url = apply_url;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

    public ArrayList<Apply_list> getApply_list() {
        return apply_list;
    }

    public void setApply_list(ArrayList<Apply_list> apply_list) {
        this.apply_list = apply_list;
    }
}
