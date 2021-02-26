package api.mch.weixin.qq.com.v3.response;

import java.util.List;
@SuppressWarnings("unused")
public class RefundDomesticResponse {
    private String refund_id;
    private String out_refund_no;
    private String transaction_id;
    private String out_trade_no;
    private Channel channel;
    private String user_received_account;
    private String success_time;
    private String create_time;
    private Status status;
    private FundsAccount funds_account;
    private Amount amount;
    private List<Promotiondetail> promotion_detail;


    public enum Channel{
        ORIGINAL,
        BALANCE,
        OTHER_BALANCE,
        OTHER_BANKCARD
    }

    public enum Status{
        SUCCESS,
        CLOSED,
        PROCESSING,
        ABNORMAL
    }

    public enum FundsAccount{
        UNSETTLED,
        AVAILABLE,
        UNAVAILABLE,
        OPERATION
    }

    public static class Amount{
        private int total;
        private int refund;
        private int payer_total;
        private int payer_refund;
        private int settlement_refund;
        private int settlement_total;
        private int discount_refund;
        private String currency;

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

        public int getSettlement_refund() {
            return settlement_refund;
        }

        public void setSettlement_refund(int settlement_refund) {
            this.settlement_refund = settlement_refund;
        }

        public int getSettlement_total() {
            return settlement_total;
        }

        public void setSettlement_total(int settlement_total) {
            this.settlement_total = settlement_total;
        }

        public int getDiscount_refund() {
            return discount_refund;
        }

        public void setDiscount_refund(int discount_refund) {
            this.discount_refund = discount_refund;
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

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
    }

    public static class Promotiondetail{
        private String promotion_id;
        private String scope;
        private String type;
        private int amount;
        private int refund_amount;
        private GoodDetail goods_detail;
        public static class GoodDetail{
            private String merchant_goods_id;
            private int refund_amount;
            private int unit_price;
            private int refund_quantity;
            private String wechatpay_goods_id;
            private String goods_name;

            public String getMerchant_goods_id() {
                return merchant_goods_id;
            }

            public void setMerchant_goods_id(String merchant_goods_id) {
                this.merchant_goods_id = merchant_goods_id;
            }

            public int getRefund_amount() {
                return refund_amount;
            }

            public void setRefund_amount(int refund_amount) {
                this.refund_amount = refund_amount;
            }

            public int getRefund_quantity() {
                return refund_quantity;
            }

            public void setRefund_quantity(int refund_quantity) {
                this.refund_quantity = refund_quantity;
            }

            public String getWechatpay_goods_id() {
                return wechatpay_goods_id;
            }

            public void setWechatpay_goods_id(String wechatpay_goods_id) {
                this.wechatpay_goods_id = wechatpay_goods_id;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public int getUnit_price() {
                return unit_price;
            }

            public void setUnit_price(int unit_price) {
                this.unit_price = unit_price;
            }


        }




        public String getScope() {
            return scope;
        }

        public void setScope(String scope) {
            this.scope = scope;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getAmount() {
            return amount;
        }

        public void setAmount(int amount) {
            this.amount = amount;
        }

        public String getPromotion_id() {
            return promotion_id;
        }

        public void setPromotion_id(String promotion_id) {
            this.promotion_id = promotion_id;
        }

        public int getRefund_amount() {
            return refund_amount;
        }

        public void setRefund_amount(int refund_amount) {
            this.refund_amount = refund_amount;
        }

        public GoodDetail getGoods_detail() {
            return goods_detail;
        }

        public void setGoods_detail(GoodDetail goods_detail) {
            this.goods_detail = goods_detail;
        }
    }

    public String getRefund_id() {
        return refund_id;
    }

    public void setRefund_id(String refund_id) {
        this.refund_id = refund_id;
    }

    public String getOut_refund_no() {
        return out_refund_no;
    }

    public void setOut_refund_no(String out_refund_no) {
        this.out_refund_no = out_refund_no;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getUser_received_account() {
        return user_received_account;
    }

    public void setUser_received_account(String user_received_account) {
        this.user_received_account = user_received_account;
    }

    public String getSuccess_time() {
        return success_time;
    }

    public void setSuccess_time(String success_time) {
        this.success_time = success_time;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public FundsAccount getFunds_account() {
        return funds_account;
    }

    public void setFunds_account(FundsAccount funds_account) {
        this.funds_account = funds_account;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public List<Promotiondetail> getPromotion_detail() {
        return promotion_detail;
    }

    public void setPromotion_detail(List<Promotiondetail> promotion_detail) {
        this.promotion_detail = promotion_detail;
    }
}
