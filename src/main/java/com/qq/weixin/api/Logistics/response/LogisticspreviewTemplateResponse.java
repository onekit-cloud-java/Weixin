package com.qq.weixin.api.Logistics.response;

public class LogisticspreviewTemplateResponse {
    private String waybill_id;
    private String rendered_waybill_template;

    public String getWaybill_id() {
        return waybill_id;
    }

    public void setWaybill_id(String waybill_id) {
        this.waybill_id = waybill_id;
    }

    public String getRendered_waybill_template() {
        return rendered_waybill_template;
    }

    public void setRendered_waybill_template(String rendered_waybill_template) {
        this.rendered_waybill_template = rendered_waybill_template;
    }
}
