package api.mch.weixin.qq.com.v3.response;

@SuppressWarnings("unused")
public class BillFundflowbillResponse {
    private String hash_type;
    private String hash_value;
    private String download_url;

    public String getHash_type() {
        return hash_type;
    }

    public void setHash_type(String hash_type) {
        this.hash_type = hash_type;
    }

    public String getHash_value() {
        return hash_value;
    }

    public void setHash_value(String hash_value) {
        this.hash_value = hash_value;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }
}
