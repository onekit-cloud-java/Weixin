package api.mch.weixin.qq.com.v3.request;

@SuppressWarnings("unused")
public class MerchantOrderqueryRequest {
    private String mchid;
    private String out_trade_no;

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }
}
