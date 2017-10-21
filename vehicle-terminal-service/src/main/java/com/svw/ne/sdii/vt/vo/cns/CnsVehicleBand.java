package com.svw.ne.sdii.vt.vo.cns;

import io.swagger.annotations.ApiModelProperty;

public class CnsVehicleBand {
    @ApiModelProperty(value = "车辆VIN码", required = true)
    private String vin;
    @ApiModelProperty(value = "状态", allowableValues = "VALID有效／RESALE已转卖／WRITTENOFF已报废")
    private String status;
    @ApiModelProperty(value = "销售状态",allowableValues = "PRE_MARKETING/POST_MARKETING")
    private String marketType;
    @ApiModelProperty(value = "DID")
    private String vtDeviceId;
    @ApiModelProperty(value = "车辆销售日期")
    private String sale_date;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMarketType() {
        return marketType;
    }

    public void setMarketType(String marketType) {
        this.marketType = marketType;
    }

    public String getVtDeviceId() {
        return vtDeviceId;
    }

    public void setVtDeviceId(String vtDeviceId) {
        this.vtDeviceId = vtDeviceId;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }


}
