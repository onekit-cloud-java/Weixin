package com.qq.weixin.api.entity;

public  class wxa__getwxacode_body{
    private String path;
    private long width;
    private boolean auto_color;
    private GRB line_color;
    private boolean is_hyaline;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public long getWidth() {
        return width;
    }

    public void setWidth(long width) {
        this.width = width;
    }

    public boolean isAuto_color() {
        return auto_color;
    }

    public void setAuto_color(boolean auto_color) {
        this.auto_color = auto_color;
    }

    public GRB getLine_color() {
        return line_color;
    }

    public void setLine_color(GRB line_color) {
        this.line_color = line_color;
    }

    public boolean isIs_hyaline() {
        return is_hyaline;
    }

    public void setIs_hyaline(boolean is_hyaline) {
        this.is_hyaline = is_hyaline;
    }
}
