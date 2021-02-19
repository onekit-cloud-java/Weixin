package com.qq.weixin.api;

import com.qq.weixin.api.request.*;
import com.qq.weixin.api.response.*;


@SuppressWarnings("unused")
public interface  WeixinAPI {

    Code2SessionResponse code2Session(Code2SessionRequest code2SessionRequest) throws WeixinError;

    GetPaidUnionIdResponse getPaidUnionId(GetPaidUnionIdRequest getPaidUnionIdRequest) throws WeixinError;

    GetAccessTokenResponse getAccessToken(GetAccessTokenRequest getAccessTokenRequest) throws WeixinError;

    GetDailyRetainResponse getDailyRetain(GetDailyRetainRequest getDailyRetainRequest);

    GetMonthlyRetainResponse getMonthlyRetain(GetMonthlyRetainRequest getMonthlyRetainRequest);

    GetWeeklyRetainResponse getWeeklyRetain(GetWeeklyRetainRequest getWeeklyRetainRequest);

    GetDailySummaryResponse getDailySummary(GetDailySummaryRequest getDailySummaryRequest);

    GetDailyVisitTrendResponse getDailyVisitTrend(GetDailyVisitTrendRequest getDailyVisitTrendRequest);

    GetMonthlyVisitTrendResponse getMonthlyVisitTrend(GetMonthlyVisitTrendRequest getMonthlyVisitTrendRequest);

    GetWeeklyVisitTrendResponse getWeeklyVisitTrend(GetWeeklyVisitTrendRequest getWeeklyVisitTrendRequest);

    GetPerformanceDataResponse getPerformanceData(GetPerformanceDataRequest getPerformanceDataRequest);

    GetUserPortraitResponse getUserPortrait(GetUserPortraitRequest getUserPortraitRequest);

    GetVisitDistributionResponse getVisitDistribution(GetVisitDistributionRequest getVisitDistributionRequest);

    GetVisitPageResponse getVisitPage(GetVisitPageRequest getVisitPageRequest);

    byte[] getTempMedia(GetTempMediaRequest getTempMediaRequest) throws WeixinError;

    SendcustomerServiceMessageResponse sendcustomerServiceMessage(SendcustomerServiceMessageRequest sendcustomerServiceMessageRequest);

    SetTypingResponse setTyping(SetTypingRequest setTypingRequest);

    UploadTempMediaResponse uploadTempMedia(UploadTempMediaRequest uploadTempMediaRequest);

    UniformsendResponse uniformsend(UniformsendRequest uniformsendRequest);

    CreateActivityIdResponse createActivityId(CreateActivityIdRequest createActivityIdRequest);

    SetUpdatableMsgResponse setUpdatableMsg(SetUpdatableMsgRequest setUpdatableMsgRequest);

    ApplyPluginResponse applyPlugin(ApplyPluginRequest applyPluginRequest);

    GetPluginDevApplyListResponse getPluginDevApplyList(GetPluginDevApplyListRequest getPluginDevApplyListRequest) throws WeixinError;

    GetPluginListResponse getPluginList(GetPluginListRequest getPluginListRequest) throws WeixinError;

    SetDevPluginApplyStatusResponse setDevPluginApplyStatus(SetDevPluginApplyStatusRequest setDevPluginApplyStatusRequest) throws WeixinError;

    UnbindPluginResponse unbindPlugin(UnbindPluginRequest unbindPluginRequest) throws WeixinError;

    AddResponse add(AddRequest addRequest);

    DeleteResponse delete(DeleteRequest deleteRequest) throws WeixinError;

    GetListResponse getList(GetListRequest getListRequest) throws WeixinError;

    SetShowStatusResponse setShowStatus(SetShowStatusRequest setShowStatusRequest) throws WeixinError;

    byte[] createQRCode(CreateQRCodeRequest createQRCodeRequest) throws WeixinError;

    byte[] get(GetRequest getRequest) throws WeixinError;

    byte[] getUnlimited(GetUnlimitedRequest getUnlimitedRequest) throws WeixinError;

    String generate(GenerateRequest generateRequest) throws WeixinError;

}
