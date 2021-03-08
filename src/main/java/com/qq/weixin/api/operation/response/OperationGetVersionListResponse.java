package com.qq.weixin.api.operation.response;

import java.util.List;

public class OperationGetVersionListResponse {
    private List<Cv> cvlist;
    public static class Cv{
        private Type type;
        private List<String> client_version_list;
        public enum Type{
            one(1),
            two(2);
            private int num;

            Type(int i) {
                this.num = i;
            }

            public int getNum() {
                return num;
            }

            public void setNum(int num) {
                this.num = num;
            }
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public List<String> getClient_version_list() {
            return client_version_list;
        }

        public void setClient_version_list(List<String> client_version_list) {
            this.client_version_list = client_version_list;
        }
    }

    public List<Cv> getCvlist() {
        return cvlist;
    }

    public void setCvlist(List<Cv> cvlist) {
        this.cvlist = cvlist;
    }
}
