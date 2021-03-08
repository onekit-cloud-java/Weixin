package com.qq.weixin.api;

import com.qq.weixin.api.UpdatableMessage.request.CreateActivityIdRequest;
import com.qq.weixin.api.UpdatableMessage.request.SetUpdatableMsgRequest;
import com.qq.weixin.api.UpdatableMessage.response.CreateActivityIdResponse;

public interface WeixinUpdatableMessageAPI {
    CreateActivityIdResponse createActivityId(CreateActivityIdRequest createActivityIdRequest);

    void setUpdatableMsg(SetUpdatableMsgRequest setUpdatableMsgRequest);
}
