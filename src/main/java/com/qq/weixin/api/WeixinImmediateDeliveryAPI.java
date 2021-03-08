package com.qq.weixin.api;

import com.qq.weixin.api.ImmediateDelivery.request.*;
import com.qq.weixin.api.ImmediateDelivery.response.*;

public interface WeixinImmediateDeliveryAPI {
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
