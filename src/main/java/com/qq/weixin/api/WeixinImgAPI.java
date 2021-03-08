package com.qq.weixin.api;

import com.qq.weixin.api.Img.request.AiCropRequest;
import com.qq.weixin.api.Img.request.ScanQRCodeRequest;
import com.qq.weixin.api.Img.request.SuperresolutionRequest;

public interface WeixinImgAPI {
    void aiCrop(AiCropRequest aiCropRequest) throws WeixinError;

    void scanQRCode(ScanQRCodeRequest scanQRCodeRequest) throws WeixinError;

    void superresolution(SuperresolutionRequest superresolutionRequest) throws WeixinError;
}
