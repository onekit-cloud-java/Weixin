package com.qq.weixin.api;

import com.qq.weixin.api.DataAnalysis.request.GenerateRequest;

public interface WeixinUrlschemeAPI {

    String generate(GenerateRequest generateRequest) throws WeixinError;
}
