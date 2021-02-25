package api.mch.weixin.qq.com.v3.request;
@SuppressWarnings("unused")
public class PayTransactionsRequest {
    private String appid;
    private String mchid;
    private String description;
    private String out_trade_no;
    private String time_expire;
    private String attach;
    private String notify_url;
    private String goods_tag;
    private Amount amount;
    private Payer payer;
    private Detail detail;
    private Scene_info scene_info;

    public static class Amount{
        private int total;
        private String currency;

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

    public static class Detail{
        private int cost_price;
        private String invoice_id;

        public int getCost_price() {
            return cost_price;
        }

        public void setCost_price(int cost_price) {
            this.cost_price = cost_price;
        }

        public String getInvoice_id() {
            return invoice_id;
        }

        public void setInvoice_id(String invoice_id) {
            this.invoice_id = invoice_id;
        }
    }

    public static class Scene_info{
        private String payer_client_ip;
        private String device_id;
        private Store_info store_info;

        public static class Store_info{
            private String id;
            private String name;
            private String area_code;
            private String address;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getArea_code() {
                return area_code;
            }

            public void setArea_code(String area_code) {
                this.area_code = area_code;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }

        public String getPayer_client_ip() {
            return payer_client_ip;
        }

        public void setPayer_client_ip(String payer_client_ip) {
            this.payer_client_ip = payer_client_ip;
        }

        public String getDevice_id() {
            return device_id;
        }

        public void setDevice_id(String device_id) {
            this.device_id = device_id;
        }

        public Store_info getStore_info() {
            return store_info;
        }

        public void setStore_info(Store_info store_info) {
            this.store_info = store_info;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOut_trade_no() {
        return out_trade_no;
    }

    public void setOut_trade_no(String out_trade_no) {
        this.out_trade_no = out_trade_no;
    }

    public String getTime_expire() {
        return time_expire;
    }

    public void setTime_expire(String time_expire) {
        this.time_expire = time_expire;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getNotify_url() {
        return notify_url;
    }

    public void setNotify_url(String notify_url) {
        this.notify_url = notify_url;
    }

    public String getGoods_tag() {
        return goods_tag;
    }

    public void setGoods_tag(String goods_tag) {
        this.goods_tag = goods_tag;
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

    public Detail getDetail() {
        return detail;
    }

    public void setDetail(Detail detail) {
        this.detail = detail;
    }

    public Scene_info getScene_info() {
        return scene_info;
    }

    public void setScene_info(Scene_info scene_info) {
        this.scene_info = scene_info;
    }
}
