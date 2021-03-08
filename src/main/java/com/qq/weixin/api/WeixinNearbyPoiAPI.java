package com.qq.weixin.api;

import com.qq.weixin.api.NearbyPoi.request.AddRequest;
import com.qq.weixin.api.NearbyPoi.request.DeleteRequest;
import com.qq.weixin.api.NearbyPoi.request.GetListRequest;
import com.qq.weixin.api.NearbyPoi.request.SetShowStatusRequest;
import com.qq.weixin.api.NearbyPoi.response.AddResponse;
import com.qq.weixin.api.NearbyPoi.response.DeleteResponse;
import com.qq.weixin.api.NearbyPoi.response.GetListResponse;

public interface WeixinNearbyPoiAPI {
    AddResponse add(AddRequest addRequest);

    DeleteResponse delete(DeleteRequest deleteRequest) throws WeixinError;

    GetListResponse getList(GetListRequest getListRequest) throws WeixinError;

    void setShowStatus(SetShowStatusRequest setShowStatusRequest) throws WeixinError;
}
