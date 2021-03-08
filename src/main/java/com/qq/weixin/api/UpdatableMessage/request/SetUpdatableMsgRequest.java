package com.qq.weixin.api.UpdatableMessage.request;

import java.util.ArrayList;
@SuppressWarnings("unused")
public class SetUpdatableMsgRequest {
    private String access_token;
    private String activity_id;
    public enum target_state{
        target_state0(0),
        target_state1(1);

        private final int target_state;

        target_state(int num) {
            this.target_state = num;
        }

        public int getTarget_state() {
            return target_state;
        }
    }
    public static class template_info{
        private ArrayList<Parameter_list> parameter_list;

        public static class Parameter_list{

            private String value;

            public enum name{
                member_count,
                room_limit,
                path,
                version_type
            }

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }
        }

        public ArrayList<Parameter_list> getParameter_list() {
            return parameter_list;
        }

        public void setParameter_list(ArrayList<Parameter_list> parameter_list) {
            this.parameter_list = parameter_list;
        }
    }
}
