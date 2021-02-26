package api.mch.weixin.qq.com.v3.request;

@SuppressWarnings("unused")
public class BillFundflowbillRequest {
    private String bill_date;
    private AccountType account_type;
    private String tar_type;

    public enum AccountType{
        BASIC,
        OPERATION,
        FEES
    }

    public String getBill_date() {
        return bill_date;
    }

    public void setBill_date(String bill_date) {
        this.bill_date = bill_date;
    }

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }

    public String getTar_type() {
        return tar_type;
    }

    public void setTar_type(String tar_type) {
        this.tar_type = tar_type;
    }
}
