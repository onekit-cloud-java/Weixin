package api.mch.weixin.qq.com.v3.notify.request;


@SuppressWarnings("unused")
public class RefundResultNotifyRequest {
    private String mchid;
    private String out_trade_no;
    private String transaction_id;
    private String out_refund_no;
    private String refund_id;
    private RefundStatus refund_status;
    private String success_time;
    private String user_received_account;
    private Amount amount;

    public enum RefundStatus{
        SUCCESS,
        CLOSE,
        ABNORMAL
    }

    public static class Amount{
        private int total;
        private int refund;
        private int payer_total;
        private int payer_refund;

        public int getRefund() {
            return refund;
        }

        public void setRefund(int refund) {
            this.refund = refund;
        }

        public int getPayer_refund() {
            return payer_refund;
        }

        public void setPayer_refund(int payer_refund) {
            this.payer_refund = payer_refund;
        }

        public int getPayer_total() {
            return payer_total;
        }

        public void setPayer_total(int payer_total) {
            this.payer_total = payer_total;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }


    }

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

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public RefundStatus getRefund_status() {
        return refund_status;
    }

    public void setRefund_status(RefundStatus refund_status) {
        this.refund_status = refund_status;
    }

    public String getSuccess_time() {
        return success_time;
    }

    public void setSuccess_time(String success_time) {
        this.success_time = success_time;
    }

    public String getUser_received_account() {
        return user_received_account;
    }

    public void setUser_received_account(String user_received_account) {
        this.user_received_account = user_received_account;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
}
