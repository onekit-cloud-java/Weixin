package com.qq.weixin.api;

import com.qq.weixin.api.PluginManager.request.*;
import com.qq.weixin.api.PluginManager.response.GetPluginDevApplyListResponse;
import com.qq.weixin.api.PluginManager.response.GetPluginListResponse;

public interface WeixinPluginManagerAPI {
    void applyPlugin(ApplyPluginRequest applyPluginRequest);

    GetPluginDevApplyListResponse getPluginDevApplyList(GetPluginDevApplyListRequest getPluginDevApplyListRequest) throws WeixinError;

    GetPluginListResponse getPluginList(GetPluginListRequest getPluginListRequest) throws WeixinError;

    void setDevPluginApplyStatus(SetDevPluginApplyStatusRequest setDevPluginApplyStatusRequest) throws WeixinError;

    void unbindPlugin(UnbindPluginRequest unbindPluginRequest) throws WeixinError;
}
