package com.qq.weixin.api.operation.response;


import java.util.List;

public class OperationRealtimelogSearchResponse {
    private Data data;

    public static class Data{
        private List<Realtimelog> list;
        public static class Realtimelog {
            private int level;
            private String libraryVersion;
            private String clientVersion;
            private String id;
            private int timestamp;
            private int platform;
            private String url;
            private List<Msg> msg;
            private String traceid;
            private String filterMsg;
            public static class Msg{
                private int time;
                private List<String> msg;
                private int level;

                public int getTime() {
                    return time;
                }

                public void setTime(int time) {
                    this.time = time;
                }

                public List<String> getMsg() {
                    return msg;
                }

                public void setMsg(List<String> msg) {
                    this.msg = msg;
                }

                public int getLevel() {
                    return level;
                }

                public void setLevel(int level) {
                    this.level = level;
                }
            }

            public int getLevel() {
                return level;
            }

            public void setLevel(int level) {
                this.level = level;
            }

            public String getLibraryVersion() {
                return libraryVersion;
            }

            public void setLibraryVersion(String libraryVersion) {
                this.libraryVersion = libraryVersion;
            }

            public String getClientVersion() {
                return clientVersion;
            }

            public void setClientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getTimestamp() {
                return timestamp;
            }

            public void setTimestamp(int timestamp) {
                this.timestamp = timestamp;
            }

            public int getPlatform() {
                return platform;
            }

            public void setPlatform(int platform) {
                this.platform = platform;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public List<Msg> getMsg() {
                return msg;
            }

            public void setMsg(List<Msg> msg) {
                this.msg = msg;
            }

            public String getTraceid() {
                return traceid;
            }

            public void setTraceid(String traceid) {
                this.traceid = traceid;
            }

            public String getFilterMsg() {
                return filterMsg;
            }

            public void setFilterMsg(String filterMsg) {
                this.filterMsg = filterMsg;
            }
        }

        public List<Realtimelog> getList() {
            return list;
        }

        public void setList(List<Realtimelog> list) {
            this.list = list;
        }
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
}
