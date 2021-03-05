package com.qq.weixin.api.response;

import java.util.List;

public class GetStatisticsResponse {
    private List<Data_column> data_column;
    private List<Data_value> data_value;

    public static class Data_column{
        private String col_id;
        private String col_name;
        private String col_data_type;

        public String getCol_id() {
            return col_id;
        }

        public void setCol_id(String col_id) {
            this.col_id = col_id;
        }

        public String getCol_name() {
            return col_name;
        }

        public void setCol_name(String col_name) {
            this.col_name = col_name;
        }

        public String getCol_data_type() {
            return col_data_type;
        }

        public void setCol_data_type(String col_data_type) {
            this.col_data_type = col_data_type;
        }
    }

    public static class Data_value{
        private List<String> data_value;

        public List<String> getData_value() {
            return data_value;
        }

        public void setData_value(List<String> data_value) {
            this.data_value = data_value;
        }
    }

    public List<Data_column> getData_column() {
        return data_column;
    }

    public void setData_column(List<Data_column> data_column) {
        this.data_column = data_column;
    }

    public List<Data_value> getData_value() {
        return data_value;
    }

    public void setData_value(List<Data_value> data_value) {
        this.data_value = data_value;
    }
}
