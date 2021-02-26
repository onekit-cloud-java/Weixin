package api.mch.weixin.qq.com.v3.notify.request;



import java.util.List;

@SuppressWarnings("unused")
public class PayResultNotifyRequest {
    private String appid;
    private String mchid;
    private String out_trade_no;
    private String transaction_id;
    private Tradetype trade_type;
    private Tradestate trade_state;
    private String trade_state_desc;
    private String bank_type;
    private String attach;
    private String success_time;
    private Amount amount;
    private Payer payer;
    private Scene_info scene_info;
    private List<Promotiondetail> promotion_detail;

    public enum Tradetype{
        JSAPI,
        NATIVE,
        APP,
        MICROPAY,
        MWEB,
        FACEPAY
    }

    public enum Tradestate{
        SUCCESS,
        REFUND,
        NOTPAY,
        CLOSED,
        REVOKED,
        USERPAYING,
        PAYERROR,
        ACCEPT
    }

    public static class Amount{
        private int total;
        private String currency;
        private int payer_total;
        private String payer_currency;

        public int getPayer_total() {
            return payer_total;
        }

        public void setPayer_total(int payer_total) {
            this.payer_total = payer_total;
        }

        public String getPayer_currency() {
            return payer_currency;
        }

        public void setPayer_currency(String payer_currency) {
            this.payer_currency = payer_currency;
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

    public static class Payer{
        private String openid;

        public String getOpenid() {
            return openid;
        }

        public void setOpenid(String openid) {
            this.openid = openid;
        }
    }

    public static class Scene_info{

        private String device_id;

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }


    }

    public static class Promotiondetail{
        private String coupon_id;
        private String name;
        private String scope;
        private String type;
        private int amount;
        private String stock_id;
        private int wechatpay_contribute;
        private int merchant_contribute;
        private int other_contribute;
        private String currency;
        private GoodDetail goods_detail;
        public static class GoodDetail{
            private String goods_id;
            private int quantity;
            private int unit_price;
            private int discount_amount;
            private String goods_remark;

            public String getGoods_id() {
                return goods_id;
            }

            public void setGoods_id(String goods_id) {
                this.goods_id = goods_id;
            }

            public int getQuantity() {
                return quantity;
            }

            public void setQuantity(int quantity) {
                this.quantity = quantity;
            }

            public int getUnit_price() {
                return unit_price;
            }

            public void setUnit_price(int unit_price) {
                this.unit_price = unit_price;
            }

            public int getDiscount_amount() {
                return discount_amount;
            }

            public void setDiscount_amount(int discount_amount) {
                this.discount_amount = discount_amount;
            }

            public String getGoods_remark() {
                return goods_remark;
            }

            public void setGoods_remark(String goods_remark) {
                this.goods_remark = goods_remark;
            }
        }

        public String getCoupon_id() {
            return coupon_id;
        }

        public void setCoupon_id(String coupon_id) {
            this.coupon_id = coupon_id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getStock_id() {
            return stock_id;
        }

        public void setStock_id(String stock_id) {
            this.stock_id = stock_id;
        }

        public int getWechatpay_contribute() {
            return wechatpay_contribute;
        }

        public void setWechatpay_contribute(int wechatpay_contribute) {
            this.wechatpay_contribute = wechatpay_contribute;
        }

        public int getMerchant_contribute() {
            return merchant_contribute;
        }

        public void setMerchant_contribute(int merchant_contribute) {
            this.merchant_contribute = merchant_contribute;
        }

        public int getOther_contribute() {
            return other_contribute;
        }

        public void setOther_contribute(int other_contribute) {
            this.other_contribute = other_contribute;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public GoodDetail getGoods_detail() {
            return goods_detail;
        }

        public void setGoods_detail(GoodDetail goods_detail) {
            this.goods_detail = goods_detail;
        }
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
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

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Payer getPayer() {
        return payer;
    }

    public void setPayer(Payer payer) {
        this.payer = payer;
    }

    public List<Promotiondetail> getPromotion_detail() {
        return promotion_detail;
    }

    public void setPromotion_detail(List<Promotiondetail> promotion_detail) {
        this.promotion_detail = promotion_detail;
    }

    public Scene_info getScene_info() {
        return scene_info;
    }

    public void setScene_info(Scene_info scene_info) {
        this.scene_info = scene_info;
    }

    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public Tradetype getTrade_type() {
        return trade_type;
    }

    public void setTrade_type(Tradetype trade_type) {
        this.trade_type = trade_type;
    }

    public Tradestate getTrade_state() {
        return trade_state;
    }

    public void setTrade_state(Tradestate trade_state) {
        this.trade_state = trade_state;
    }

    public String getTrade_state_desc() {
        return trade_state_desc;
    }

    public void setTrade_state_desc(String trade_state_desc) {
        this.trade_state_desc = trade_state_desc;
    }

    public String getBank_type() {
        return bank_type;
    }

    public void setBank_type(String bank_type) {
        this.bank_type = bank_type;
    }

    public String getSuccess_time() {
        return success_time;
    }

    public void setSuccess_time(String success_time) {
        this.success_time = success_time;
    }
}
