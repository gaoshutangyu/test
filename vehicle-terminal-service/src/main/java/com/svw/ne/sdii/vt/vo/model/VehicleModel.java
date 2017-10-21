package com.svw.ne.sdii.vt.vo.model;

import com.svw.ne.sdii.vt.vo.series.VehicleSeries;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yong.liu on 2016/12/5.
 * 车型
 */
public class VehicleModel {
    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "车型名称", required = true)
    private String name;
    @ApiModelProperty(value = "别名")
    private String nameAlias;
    @ApiModelProperty(value = "车系ID")
    private Long seriesId;
    @ApiModelProperty(value = "车型分类ID")
    private Long modelTypeId;
    @ApiModelProperty(value = "车型代码", required = true)
    private String code;
    @ApiModelProperty(value = "车型代码")
    private String code2;
    @ApiModelProperty(value = "描述")
    private String remark;
    @ApiModelProperty(value = "发布时间")
    private Date publishTime;
    private VehicleModelType vehicleModelType;
    private VehicleSeries vehicleSeries;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public Long getSeriesId() {
        return seriesId;
    }

    public void setSeriesId(Long seriesId) {
        this.seriesId = seriesId;
    }

    public Long getModelTypeId() {
        return modelTypeId;
    }

    public void setModelTypeId(Long modelTypeId) {
        this.modelTypeId = modelTypeId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public VehicleModelType getVehicleModelType() {
        return vehicleModelType;
    }

    public void setVehicleModelType(VehicleModelType vehicleModelType) {
        this.vehicleModelType = vehicleModelType;
    }

    public VehicleSeries getVehicleSeries() {
        return vehicleSeries;
    }

    public void setVehicleSeries(VehicleSeries vehicleSeries) {
        this.vehicleSeries = vehicleSeries;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }
}
