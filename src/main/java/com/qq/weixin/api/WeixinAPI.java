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

    WeixinResponse sendcustomerServiceMessage(SendcustomerServiceMessageRequest sendcustomerServiceMessageRequest);

    WeixinResponse setTyping(SetTypingRequest setTypingRequest);

    UploadTempMediaResponse uploadTempMedia(UploadTempMediaRequest uploadTempMediaRequest);

    WeixinResponse uniformsend(UniformsendRequest uniformsendRequest);

    CreateActivityIdResponse createActivityId(CreateActivityIdRequest createActivityIdRequest);

    WeixinResponse setUpdatableMsg(SetUpdatableMsgRequest setUpdatableMsgRequest);

    WeixinResponse applyPlugin(ApplyPluginRequest applyPluginRequest);

    GetPluginDevApplyListResponse getPluginDevApplyList(GetPluginDevApplyListRequest getPluginDevApplyListRequest) throws WeixinError;

    GetPluginListResponse getPluginList(GetPluginListRequest getPluginListRequest) throws WeixinError;

    WeixinResponse setDevPluginApplyStatus(SetDevPluginApplyStatusRequest setDevPluginApplyStatusRequest) throws WeixinError;

    WeixinResponse unbindPlugin(UnbindPluginRequest unbindPluginRequest) throws WeixinError;

    AddResponse add(AddRequest addRequest);

    DeleteResponse delete(DeleteRequest deleteRequest) throws WeixinError;

    GetListResponse getList(GetListRequest getListRequest) throws WeixinError;

    WeixinResponse setShowStatus(SetShowStatusRequest setShowStatusRequest) throws WeixinError;

    byte[] createQRCode(CreateQRCodeRequest createQRCodeRequest) throws WeixinError;

    byte[] get(GetRequest getRequest) throws WeixinError;

    byte[] getUnlimited(GetUnlimitedRequest getUnlimitedRequest) throws WeixinError;

    String generate(GenerateRequest generateRequest) throws WeixinError;

    WeixinResponse imgSecCheck(ImgSecCheckRequest imgSecCheckRequest) ;

    MediaCheckAsyncResponse mediaCheckAsync(MediaCheckAsyncRequest mediaCheckAsyncRequest);

    WeixinResponse msgSecCheck(MsgSecCheckRequest msgSecCheckRequest);

    // addUserActionResponse addUserAction(addUserActionRequest addUserActionRequest);

    GetOpenDataResponse getOpenData(GetOpenDataRequest getOpenDataRequest);

    GetVoIPSignResponse getVoIPSign(GetVoIPSignRequest getVoIPSignRequest);

    SendSmsResponse sendSms(SendSmsRequest sendSmsRequest);

    WeixinResponse aiCrop(AiCropRequest aiCropRequest);

    WeixinResponse scanQRCode(ScanQRCodeRequest scanQRCodeRequest);

    WeixinResponse superresolution(SuperresolutionRequest superresolutionRequest);


}
