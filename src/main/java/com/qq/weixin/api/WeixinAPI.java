package com.qq.weixin.api;

import com.qq.weixin.api.request.*;
import com.qq.weixin.api.response.*;


@SuppressWarnings("unused")
public interface  WeixinAPI {

    Code2SessionResponse code2Session(Code2SessionRequest code2SessionRequest) throws WeixinError;

    GetPaidUnionIdRequest getPaidUnionId(GetPaidUnionIdResponse getPaidUnionIdResponse) throws WeixinError;

    GetAccessTokenRequest getAccessToken(GetAccessTokenResponse getAccessTokenResponse) throws WeixinError;

    GetDailyRetainRequest getDailyRetain(GetDailyRetainResponse getDailyRetainResponse);

    GetMonthlyRetainRequset getMonthlyRetain(GetMonthlyRetainResponse getMonthlyRetainResponse);




}
