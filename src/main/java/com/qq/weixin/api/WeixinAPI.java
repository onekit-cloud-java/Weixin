package com.qq.weixin.api;

import cn.onekit.thekit.SIGN;
import com.qq.weixin.api.request.*;
import com.qq.weixin.api.response.*;


@SuppressWarnings("unused")
public interface  WeixinAPI {
    default String _signBody(String wx_sig_method, String wx_session_key, String wx_body) throws Exception {
        SIGN.Method method;
        if ("hmac_sha256".equals(wx_sig_method)) {
            method = SIGN.Method.HMACSHA256;
        } else {
            throw new Exception(wx_sig_method);
        }
        return new SIGN(method).sign(wx_session_key, wx_body);
    }
    default String _signRaw(String wx_rawData,String wx_session_key) throws Exception {
        return new SIGN(SIGN.Method.SHA1).sign(wx_rawData+wx_session_key);
    }

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

    void sendcustomerServiceMessage(SendcustomerServiceMessageRequest sendcustomerServiceMessageRequest);

    void setTyping(SetTypingRequest setTypingRequest);

    UploadTempMediaResponse uploadTempMedia(UploadTempMediaRequest uploadTempMediaRequest);

    void uniformsend(UniformsendRequest uniformsendRequest);

    CreateActivityIdResponse createActivityId(CreateActivityIdRequest createActivityIdRequest);

    void setUpdatableMsg(SetUpdatableMsgRequest setUpdatableMsgRequest);

    void applyPlugin(ApplyPluginRequest applyPluginRequest);

    GetPluginDevApplyListResponse getPluginDevApplyList(GetPluginDevApplyListRequest getPluginDevApplyListRequest) throws WeixinError;

    GetPluginListResponse getPluginList(GetPluginListRequest getPluginListRequest) throws WeixinError;

    void setDevPluginApplyStatus(SetDevPluginApplyStatusRequest setDevPluginApplyStatusRequest) throws WeixinError;

    void unbindPlugin(UnbindPluginRequest unbindPluginRequest) throws WeixinError;

    AddResponse add(AddRequest addRequest);

    DeleteResponse delete(DeleteRequest deleteRequest) throws WeixinError;

    GetListResponse getList(GetListRequest getListRequest) throws WeixinError;

    void setShowStatus(SetShowStatusRequest setShowStatusRequest) throws WeixinError;

    byte[] createQRCode(CreateQRCodeRequest createQRCodeRequest) throws WeixinError;

    byte[] get(GetRequest getRequest) throws WeixinError;

    byte[] getUnlimited(GetUnlimitedRequest getUnlimitedRequest) throws WeixinError;

    String generate(GenerateRequest generateRequest) throws WeixinError;

    void imgSecCheck(ImgSecCheckRequest imgSecCheckRequest) throws WeixinError;

    MediaCheckAsyncResponse mediaCheckAsync(MediaCheckAsyncRequest mediaCheckAsyncRequest)throws WeixinError;

    void msgSecCheck(MsgSecCheckRequest msgSecCheckRequest)throws WeixinError;

    GetOpenDataResponse getOpenData(GetOpenDataRequest getOpenDataRequest)throws WeixinError;

    GetStatisticsResponse getStatistics(GetStatisticsRequest getOpenDataRequest)throws WeixinError;

    GetVoIPSignResponse getVoIPSign(GetVoIPSignRequest getVoIPSignRequest)throws WeixinError;

    void report(ReportRequest getVoIPSignRequest)throws WeixinError;

    SendSmsResponse sendSms(SendSmsRequest sendSmsRequest)throws WeixinError;

    CreateSendSmsTaskResponse createSendSmsTask(CreateSendSmsTaskRequest sendSmsRequest)throws WeixinError;

    void aiCrop(AiCropRequest aiCropRequest) throws WeixinError;

    void scanQRCode(ScanQRCodeRequest scanQRCodeRequest) throws WeixinError;

    void superresolution(SuperresolutionRequest superresolutionRequest) throws WeixinError;

    AbnormalConfirmResponse abnormalConfirm(AbnormalConfirmRequest abnormalConfirmRequest) throws WeixinError;

    AddOrderResponse addOrder(AddOrderRequest addOrderRequest) throws WeixinError;

    void addTip(AddTipRequest addTipRequest) throws WeixinError;

    void bindAccount(BindAccountRequest bindAccountRequest) throws WeixinError;

    CancelOrderResponse cancelOrder(CancelOrderrRequest cancelOrderrRequest) throws WeixinError;

    GetAllImmeDeliveryResponse getAllImmeDelivery(GetAllImmeDeliveryRequest cancelOrderrRequest) throws WeixinError;

    GetBindAccountResponse getBindAccount(GetBindAccountRequest cancelOrderrRequest) throws WeixinError;

    GetOrderResponse getOrder(GetOrderRequest cancelOrderrRequest) throws WeixinError;

    void mockUpdateOrder(MockUpdateOrderRequest cancelOrderrRequest) throws WeixinError;

    OnOrderStatusResponse onOrderStatus(OnOrderStatusRequest cancelOrderrRequest) throws WeixinError;

    void openDelivery(OpenDeliveryRequest cancelOrderrRequest) throws WeixinError;

    PreAddOrderResponse preAddOrder(PreAddOrderRequest cancelOrderrRequest) throws WeixinError;

    PreCancelOrderResponse preCancelOrder(PreCancelOrderRequest cancelOrderrRequest) throws WeixinError;

    void realMockUpdateOrder(RealMockUpdateOrderRequest cancelOrderrRequest) throws WeixinError;

    ReOrderResponse reOrder(ReOrderRequest cancelOrderrRequest) throws WeixinError;



}
