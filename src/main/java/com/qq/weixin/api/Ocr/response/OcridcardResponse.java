package com.qq.weixin.api.Ocr.response;

public class OcridcardResponse {
    private Type type;
    private String valid_date;
    public enum Type{
        Front,
        Back
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String getValid_date() {
        return valid_date;
    }

    public void setValid_date(String valid_date) {
        this.valid_date = valid_date;
    }
}
