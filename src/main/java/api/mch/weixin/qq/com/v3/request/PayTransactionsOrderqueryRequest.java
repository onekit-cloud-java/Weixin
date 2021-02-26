package api.mch.weixin.qq.com.v3.request;
@SuppressWarnings("unused")
public class PayTransactionsOrderqueryRequest {
    private String mchid;
    private String transaction_id;

    public String getMchid() {
        return mchid;
    }

    public void setMchid(String mchid) {
        this.mchid = mchid;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }
}
