package com.qq.weixin.api.response;

import com.qq.weixin.api.WeixinError;

import java.util.ArrayList;

public class GetPluginListResponse extends WeixinError {
    private ArrayList<Plugin_list> plugin_list;

    public static class Plugin_list {
        private String appid;
        private String headimgurl;
        private String nickname;

        public enum status {
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
    }

    public ArrayList<Plugin_list> getPlugin_list() {
        return plugin_list;
    }

    public void setPlugin_list(ArrayList<Plugin_list> plugin_list) {
        this.plugin_list = plugin_list;
    }
}
