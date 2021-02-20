package com.qq.weixin.api.request;

@SuppressWarnings("unused")
public class GetListRequest {
    private String access_token;
    private int page;
    private int page_rows;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPage_rows() {
        return page_rows;
    }

    public void setPage_rows(int page_rows) {
        this.page_rows = page_rows;
    }
}
