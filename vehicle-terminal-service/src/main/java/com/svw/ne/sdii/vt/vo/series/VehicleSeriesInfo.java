package com.svw.ne.sdii.vt.vo.series;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/8.
 */
public class VehicleSeriesInfo extends VehicleSeries {
    @ApiModelProperty(value = "车辆品牌")
    private String brandName;
    @ApiModelProperty("品牌Code")
    private String brandCode;

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getBrandCode() {
        return brandCode;
    }

    public void setBrandCode(String brandCode) {
        this.brandCode = brandCode;
    }
}
