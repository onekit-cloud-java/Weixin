package com.qq.weixin.api;

import com.qq.weixin.api.UniformMessage.request.UniformsendRequest;

public interface WeixinUniformMessageAPI {
    void uniformsend(UniformsendRequest uniformsendRequest);
}
