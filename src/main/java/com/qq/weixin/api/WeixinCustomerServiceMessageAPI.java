package com.qq.weixin.api;

import com.qq.weixin.api.CustomerServiceMessage.request.GetTempMediaRequest;
import com.qq.weixin.api.CustomerServiceMessage.request.SendcustomerServiceMessageRequest;
import com.qq.weixin.api.CustomerServiceMessage.request.SetTypingRequest;
import com.qq.weixin.api.CustomerServiceMessage.request.UploadTempMediaRequest;
import com.qq.weixin.api.CustomerServiceMessage.response.UploadTempMediaResponse;

public interface WeixinCustomerServiceMessageAPI {
    byte[] getTempMedia(GetTempMediaRequest getTempMediaRequest) throws WeixinError;

    void sendcustomerServiceMessage(SendcustomerServiceMessageRequest sendcustomerServiceMessageRequest);

    void setTyping(SetTypingRequest setTypingRequest);

    UploadTempMediaResponse uploadTempMedia(UploadTempMediaRequest uploadTempMediaRequest);
}
