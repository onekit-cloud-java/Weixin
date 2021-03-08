package com.qq.weixin.api.Cloudbase.response;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class SendSmsResponse {
    private ArrayList<Send_status_list> send_status_list;

    public ArrayList<Send_status_list> getSend_status_list() {
        return send_status_list;
    }

    public void setSend_status_list(ArrayList<Send_status_list> send_status_list) {
        this.send_status_list = send_status_list;
    }

    public static class Send_status_list{
        private String serial_no;
        private String phone_number;
        private String code;
        private String message;
        private String iso_code;

        public String getSerial_no() {
            return serial_no;
        }

        public void setSerial_no(String serial_no) {
            this.serial_no = serial_no;
        }

        public String getPhone_number() {
            return phone_number;
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getIso_code() {
            return iso_code;
        }

        public void setIso_code(String iso_code) {
            this.iso_code = iso_code;
        }
    }
}
