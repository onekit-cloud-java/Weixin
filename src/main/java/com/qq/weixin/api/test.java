package com.qq.weixin.api;

import com.qq.weixin.api.request.GetPerformanceDataRequest;
import com.qq.weixin.api.response.GetPerformanceDataResponse;
import com.qq.weixin.api.response.GetPluginDevApplyListResponse;

public class test {
    public static void main(String[] args) {
        GetPerformanceDataResponse getPerformanceDataResponse = new GetPerformanceDataResponse();
//        GetPerformanceDataRequest getPerformanceDataRequest = new GetPerformanceDataRequest();
//        System.out.println(GetPerformanceDataRequest.module.module_10016.getModule());
//        System.out.println(GetPerformanceDataRequest.Params.field.networktype);
        System.out.println(GetPluginDevApplyListResponse.Apply_list.status.status1.getStatus());
    }

}
