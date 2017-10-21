package com.svw.ne.sdii.vt.vo.vehicle;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

/**
 * Created by andy on 2017/5/18.
 */
public class CollectionVehBaseInfo {
    @NotNull
    @ApiModelProperty(value = "颜色名称", required = true)
    private String colorName;
    @NotNull
    @ApiModelProperty(value = "品牌名称", required = true)
    private String brandName;
    @NotNull
    @ApiModelProperty(value = "车系名称", required = true)
    private String seriesName;
    @NotNull
    @ApiModelProperty(value = "车系类型名称", required = true)
    private String seriesTypeName;
    @NotNull
    @ApiModelProperty(value = "车型名称", required = true)
    private String modelName;
    @NotNull
    @ApiModelProperty(value = "车型类型名称", required = true)
    private String modelTypeName;

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getSeriesName() {
        return seriesName;
    }

    public void setSeriesName(String seriesName) {
        this.seriesName = seriesName;
    }

    public String getSeriesTypeName() {
        return seriesTypeName;
    }

    public void setSeriesTypeName(String seriesTypeName) {
        this.seriesTypeName = seriesTypeName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelTypeName() {
        return modelTypeName;
    }

    public void setModelTypeName(String modelTypeName) {
        this.modelTypeName = modelTypeName;
    }
}
