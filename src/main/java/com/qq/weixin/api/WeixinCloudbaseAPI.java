package com.qq.weixin.api;

import com.qq.weixin.api.Cloudbase.request.*;
import com.qq.weixin.api.Cloudbase.response.*;

public interface WeixinCloudbaseAPI {
    GetOpenDataResponse getOpenData(GetOpenDataRequest getOpenDataRequest)throws WeixinError;

    GetStatisticsResponse getStatistics(GetStatisticsRequest getOpenDataRequest)throws WeixinError;

    GetVoIPSignResponse getVoIPSign(GetVoIPSignRequest getVoIPSignRequest)throws WeixinError;

    void report(ReportRequest getVoIPSignRequest)throws WeixinError;

    SendSmsResponse sendSms(SendSmsRequest sendSmsRequest)throws WeixinError;

    CreateSendSmsTaskResponse createSendSmsTask(CreateSendSmsTaskRequest sendSmsRequest)throws WeixinError;
}
