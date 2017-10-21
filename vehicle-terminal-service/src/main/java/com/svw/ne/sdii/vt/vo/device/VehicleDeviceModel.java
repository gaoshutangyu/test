package com.svw.ne.sdii.vt.vo.device;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 设备类型
 */
public class VehicleDeviceModel {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "类型名称", required = true)
    private String name;
    @ApiModelProperty("别名")
    private String nameAlias;
    @ApiModelProperty("供应商ID")
    private Long manufacturerId;
    @ApiModelProperty("供应商名称")
    private String manufacturerName;
    @ApiModelProperty("备注")
    private String remark;

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

    public Long getManufacturerId() {
        return manufacturerId;
    }

    public void setManufacturerId(Long manufacturerId) {
        this.manufacturerId = manufacturerId;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
