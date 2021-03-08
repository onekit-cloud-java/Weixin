package com.qq.weixin.api.operation.request;

public class OperationGetPerformanceRequest {
    private String access_token;
    private Timetype cost_time_type;
    private int default_start_time;
    private int default_end_time;
    private Device device;
    private Downloadcode is_download_code;
    private String scene;
    private Networktype networktype;
    public enum Timetype {
        one(1),
        two(2),
        three(3);
        private int value;

        Timetype(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
    public enum Device {
        all("@_all"),
        one(1),
        two(2);

        private int num;
        private String str;

        Device(String s) {
            this.str = s;
        }

        Device(int i) {
            this.num = i;
        }


        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
    public enum Downloadcode {
        all("@_all"),
        one(1),
        two(2);

        private int num;
        private String str;

        Downloadcode(String s) {
            this.str = s;
        }

        Downloadcode(int i) {
            this.num = i;
        }


        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }
    public enum Networktype {
        all("@_all"),
        wifi("wifi"),
        twog("2g"),
        threeg("3g"),
        fourg("4g");

        private String str;

        Networktype(String s) {
            this.str = s;
        }


        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Timetype getCost_time_type() {
        return cost_time_type;
    }

    public void setCost_time_type(Timetype cost_time_type) {
        this.cost_time_type = cost_time_type;
    }

    public int getDefault_start_time() {
        return default_start_time;
    }

    public void setDefault_start_time(int default_start_time) {
        this.default_start_time = default_start_time;
    }

    public int getDefault_end_time() {
        return default_end_time;
    }

    public void setDefault_end_time(int default_end_time) {
        this.default_end_time = default_end_time;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Downloadcode getIs_download_code() {
        return is_download_code;
    }

    public void setIs_download_code(Downloadcode is_download_code) {
        this.is_download_code = is_download_code;
    }

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public Networktype getNetworktype() {
        return networktype;
    }

    public void setNetworktype(Networktype networktype) {
        this.networktype = networktype;
    }
}
