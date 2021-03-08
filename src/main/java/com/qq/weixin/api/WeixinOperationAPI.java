package com.qq.weixin.api;

import com.qq.weixin.api.operation.request.*;
import com.qq.weixin.api.operation.response.*;

public interface WeixinOperationAPI {

    OperationGetFeedbackResponse operationGetFeedback(OperationGetFeedbackRequest cancelOrderrRequest) throws WeixinError;

    byte[] operationGetFeedbackmedia(OperationGetFeedbackmediaRequest cancelOrderrRequest) throws WeixinError;

    OperationGetJsErrDetailResponse operationGetJsErrDetail(OperationGetJsErrDetailRequest cancelOrderrRequest) throws WeixinError;

    OperationGetJJsErrListResponse operationGetJsErrList(OperationGetJsErrListRequest cancelOrderrRequest) throws WeixinError;

    OperationGetJsErrSearchResponse operationGetJsErrSearch(OperationGetJsErrSearchRequest cancelOrderrRequest) throws WeixinError;

    OperationGetPerformanceResponse operationGetPerformance(OperationGetPerformanceRequest cancelOrderrRequest) throws WeixinError;

    OperationGetSceneListResponse operationGetSceneList(OperationGetSceneListRequest cancelOrderrRequest) throws WeixinError;

    OperationGetVersionListResponse operationGetVersionList(OperationGetVersionListRequest cancelOrderrRequest) throws WeixinError;

    OperationRealtimelogSearchResponse operationRealtimelogSearch(OperationRealtimelogSearchRequest cancelOrderrRequest) throws WeixinError;

}
