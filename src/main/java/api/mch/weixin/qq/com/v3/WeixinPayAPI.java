package api.mch.weixin.qq.com.v3;

import api.mch.weixin.qq.com.v3.request.*;
import api.mch.weixin.qq.com.v3.response.*;
import com.qq.weixin.api.WeixinError;


@SuppressWarnings("unused")
public interface WeixinpayAPI {

    PayTransactionsJsapiResponse payTransactions(PayTransactionsJsapiRequest payRequest) throws WeixinError;

    PayTransactionsOrderqueryResponse payOrderquery(PayTransactionsOrderqueryRequest payTransactionsOrderqueryRequest) throws WeixinError;

    PayTransactionsOrderqueryResponse merchantOrderquery(MerchantOrderqueryRequest merchantOrderqueryRequest) throws WeixinError;

    void payTransactionsClose(PayTransactionsCloseRequest payTransactionsCloseRequest) throws WeixinError;

    RefundResponse refund(RefundRequest refundRequest) throws WeixinError;

    RefundDomesticResponse refundDomestic(RefundDomesticRequest refundDomesticRequest) throws WeixinError;

    BillTradebillResponse billTradebill(BillTradebillRequest billTradebillRequest) throws WeixinError;

    BillFundflowbillResponse billFundflowbill(BillFundflowbillRequest billFundflowbillRequest) throws WeixinError;

    byte[] billdownload(String download_url,BilldownloadHeader billdownloadHeader) throws Exception;






}
