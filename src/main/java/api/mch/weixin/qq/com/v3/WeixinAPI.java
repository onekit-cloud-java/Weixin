package api.mch.weixin.qq.com.v3;

import api.mch.weixin.qq.com.v3.request.PayNoticeRequest;
import api.mch.weixin.qq.com.v3.request.PayTransactionsRequest;
import api.mch.weixin.qq.com.v3.response.PayNoticeResponse;
import api.mch.weixin.qq.com.v3.response.PayTransactionsResponse;
import com.qq.weixin.api.WeixinError;


@SuppressWarnings("unused")
public interface WeixinAPI {

    PayTransactionsResponse PayTransactions(PayTransactionsRequest payRequest) throws WeixinError;

    PayNoticeResponse PayNotice(PayNoticeRequest payRequest) throws WeixinError;


}
