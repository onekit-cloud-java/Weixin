package com.qq.weixin.api;

import com.qq.weixin.api.Logistics.request.*;
import com.qq.weixin.api.Logistics.response.*;

public interface WeixinLogisticsAPI {

    LogisticsaddOrderResponse logisticsaddOrder(LogisticsaddOrderRequest cancelOrderrRequest) throws WeixinError;

    LogisticsbatchGetOrderResponse logisticsbatchGetOrder(LogisticsbatchGetOrderRequest cancelOrderrRequest) throws WeixinError;

    void logisticsbindAccount(LogisticsbindAccountRequest cancelOrderrRequest) throws WeixinError;

    LogisticscancelOrderResponse logisticscancelOrder(LogisticscancelOrderRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetAllAccountResponse logisticsgetAllAccount(LogisticsgetAllAccountRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetAllDeliveryResponse logisticsgetAllDelivery(LogisticsgetAllDeliveryRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetOrderResponse logisticsgetOrder(LogisticsgetOrderRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetPathResponse logisticsgetPath(LogisticsgetPathRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetPrinterResponse logisticsgetPrinter(LogisticsgetPrinterRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetQuotaResponse logisticsgetQuota(LogisticsgetQuotaRequest cancelOrderrRequest) throws WeixinError;

    LogisticsonBindResultUpdateRequset logisticsonBindResultUpdate() throws WeixinError;

    LogisticsonPathUpdateRequset logisticsonPathUpdate() throws WeixinError;

    void logisticstestUpdateOrder(LogisticstestUpdateOrderRequest cancelOrderrRequest) throws WeixinError;

    void logisticsupdatePrinter(LogisticsupdatePrinterRequest cancelOrderrRequest) throws WeixinError;

    LogisticsgetContactResponse logisticsgetContact(LogisticsgetContactRequest cancelOrderrRequest) throws WeixinError;

    LogisticspreviewTemplateResponse logisticspreviewTemplate(LogisticspreviewTemplateRequest cancelOrderrRequest) throws WeixinError;

    void logisticsupdateBusiness(LogisticsupdateBusinessRequest cancelOrderrRequest) throws WeixinError;

    void logisticsupdatePath(LogisticsupdatePathRequest cancelOrderrRequest) throws WeixinError;

}
