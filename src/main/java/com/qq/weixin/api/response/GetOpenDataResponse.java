package com.qq.weixin.api.response;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class GetOpenDataResponse extends WeixinResponse {
    private ArrayList<Data_list> data_list;

    public ArrayList<Data_list> getData_list() {
        return data_list;
    }

    public void setData_list(ArrayList<Data_list> data_list) {
        this.data_list = data_list;
    }

    public static class Data_list{
        private String cloud_id;
        private Json json;

        public String getCloud_id() {
            return cloud_id;
        }

        public void setCloud_id(String cloud_id) {
            this.cloud_id = cloud_id;
        }

        public Json getJson() {
            return json;
        }

        public void setJson(Json json) {
            this.json = json;
        }

        public static class Json{
            private String cloud_id;
            private Data data;

            public String getCloud_id() {
                return cloud_id;
            }

            public void setCloud_id(String cloud_id) {
                this.cloud_id = cloud_id;
            }

            public Data getData() {
                return data;
            }

            public void setData(Data data) {
                this.data = data;
            }
            public static class Data{
                private ArrayList<StepInfoList> stepInfoList;

                public ArrayList<StepInfoList> getStepInfoList() {
                    return stepInfoList;
                }

                public void setStepInfoList(ArrayList<StepInfoList> stepInfoList) {
                    this.stepInfoList = stepInfoList;
                }
                public static class StepInfoList{
                    private String timestamp;
                    private String step;

                    public String getTimestamp() {
                        return timestamp;
                    }

                    public void setTimestamp(String timestamp) {
                        this.timestamp = timestamp;
                    }

                    public String getStep() {
                        return step;
                    }

                    public void setStep(String step) {
                        this.step = step;
                    }
                }
            }
        }
    }
}
