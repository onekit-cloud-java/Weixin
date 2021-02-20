package com.qq.weixin.api.response;


@SuppressWarnings("unused")
public class GetPerformanceDataResponse extends WeixinResponse {
    private Body body;
    public static class Body{
        private Tables tables;
        private int count;

        public static class Tables{
            private String id;
            private Lines lines;
            private String zh;

            public static class Lines{
                private Fields fields;

                public static class Fields{
                    private String refdate;
                    private String value;

                    public String getRefdate() {
                        return refdate;
                    }

                    public void setRefdate(String refdate) {
                        this.refdate = refdate;
                    }

                    public String getValue() {
                        return value;
                    }

                    public void setValue(String value) {
                        this.value = value;
                    }
                }

                public Fields getFields() {
                    return fields;
                }

                public void setFields(Fields fields) {
                    this.fields = fields;
                }
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public Lines getLines() {
                return lines;
            }

            public void setLines(Lines lines) {
                this.lines = lines;
            }

            public String getZh() {
                return zh;
            }

            public void setZh(String zh) {
                this.zh = zh;
            }
        }

        public Tables getTables() {
            return tables;
        }

        public void setTables(Tables tables) {
            this.tables = tables;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }
}
