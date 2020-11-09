package com.qq.weixin.api.entity;


public  class wxa__getwxacodeunlimit_body{
    private String scene;
    private String page;
    private long width;
    private boolean auto_color;
    private GRB line_color;
    private boolean is_hyaline;

    public String getScene() {
        return scene;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
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

    public void setLine_color(GRB line_GBcolor) {
        this.line_color = line_color;
    }

    public boolean isIs_hyaline() {
        return is_hyaline;
    }

    public void setIs_hyaline(boolean is_hyaline) {
        this.is_hyaline = is_hyaline;
    }
}

