package com.qq.weixin.api.request;
@SuppressWarnings("unused")
public class SetShowStatusRequest {
    private String access_token;
    private String poi_id;
    public enum status{
        status0(0),
        status1(1);
        private int status;

        status(int num) {
            this.status = num;
        }

        public int getStatus() {
            return status;
        }
    }
}
