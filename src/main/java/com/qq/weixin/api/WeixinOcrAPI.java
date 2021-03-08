package com.qq.weixin.api;

import com.qq.weixin.api.Ocr.request.*;
import com.qq.weixin.api.Ocr.response.*;

public interface WeixinOcrAPI {
    OcrbankcardResponse ocrbankcard(OcrbankcardRequest cancelOrderrRequest) throws WeixinError;

    OcrBusinessLicenseResponse ocrBusinessLicense(OcrBusinessLicenseRequest cancelOrderrRequest) throws WeixinError;

    OcrdriverLicenseResponse ocrdriverLicense(OcrdriverLicenseRequest cancelOrderrRequest) throws WeixinError;

    OcridcardResponse ocridcard(OcridcardRequest cancelOrderrRequest) throws WeixinError;

    OcrprintedTextResponse ocrprintedText(OcrprintedTextRequest cancelOrderrRequest) throws WeixinError;

    OcrvehicleLicenseResponse ocrvehicleLicense(OcrvehicleLicenseRequest cancelOrderrRequest) throws WeixinError;
}
