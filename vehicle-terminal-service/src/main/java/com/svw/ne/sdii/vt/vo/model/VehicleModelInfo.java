package com.svw.ne.sdii.vt.vo.model;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/8.
 */
public class VehicleModelInfo extends VehicleModel {
    @ApiModelProperty(value = "品牌ID")
    private Long brandId;
    @ApiModelProperty(value = "车辆品牌")
    private String brandName;
    @ApiModelProperty("品牌Code")
    private String brandCode;
    @ApiModelProperty(value = "车系ID")
    private Long seriesId;
    @ApiModelProperty(value = "车系名称")
    private String seriesName;
    @ApiModelProperty("车系Code")
    private String seriesCode;

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

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

    @Override
    public Long getSeriesId() {
        return seriesId;
    }

    @Override
    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getSeriesCode() {
        return seriesCode;
    }

    public void setSeriesCode(String seriesCode) {
        this.seriesCode = seriesCode;
    }

}
