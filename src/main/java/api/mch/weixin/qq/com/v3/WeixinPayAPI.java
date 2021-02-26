package api.mch.weixin.qq.com.v3;

import api.mch.weixin.qq.com.v3.request.PayNoticeRequest;
import api.mch.weixin.qq.com.v3.request.PayRefundRequest;
import api.mch.weixin.qq.com.v3.request.PayRefundqueryRequest;
import api.mch.weixin.qq.com.v3.request.PayTransactionsRequest;
import api.mch.weixin.qq.com.v3.response.*;
import com.qq.weixin.api.WeixinError;


@SuppressWarnings("unused")
public interface WeixinPayAPI {

    PayTransactionsResponse PayTransactions(PayTransactionsRequest payRequest) throws WeixinError;

    PayNoticeResponse PayNotice(PayNoticeRequest payRequest) throws WeixinError;

    PayRefundResponse PayRefund(PayRefundRequest payRequest) throws WeixinError;

    PayRefundNoticeResponse PayRefundNotice() throws WeixinError;

    PayRefundqueryResponse PayRefundquery(PayRefundqueryRequest payRequest) throws WeixinError;


}
