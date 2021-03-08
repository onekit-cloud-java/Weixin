package com.qq.weixin.api.Ocr.request;

public class OcrvehicleLicenseRequest {
    private String access_token;
    private Type type;
    private String img_url;
    private byte[] img;
    public enum Type{
        photo,
        scan
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
}
