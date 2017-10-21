package com.svw.ne.sdii.vt.vo.vehicle;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by Robin on 9/27/16.
 * 车辆基础信息
 */
public class VehicleBaseInfo extends BaseObjct {
    @ApiModelProperty(value = "车辆VIN码")
    private String vin;
    @ApiModelProperty(value = "车型ID")
    private Long modelId;
    @ApiModelProperty(value = "车型代码")
    private String modelCode;
    @ApiModelProperty(value = "车型名称")
    private String modelName;
    @ApiModelProperty(value = "颜色ID")
    private Long colorId;
    @ApiModelProperty(value = "车辆颜色名称")
    private String colorName;
    @ApiModelProperty(value = "车辆颜色代码")
    private String colorCode;
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
    @ApiModelProperty(value = "车辆发动机编号")
    private String engineNumber;
    @ApiModelProperty(value = "车主姓名")
    private String ownerName;
    @ApiModelProperty(value = "车主Id")
    private Long ownerId;
    @ApiModelProperty(value = "车主手机号码")
    private String mobilePhone;
    @ApiModelProperty(value = "车辆牌照")
    private String licensePlate;
    @ApiModelProperty(value = "车辆销售日期")
    private String saleDate;
    @ApiModelProperty("下线时间")
    private Date offLineDate;
    @ApiModelProperty(value = "车辆状态", allowableValues = "VALID有效／RESALE已转卖／WRITTENOFF已报废")
    private LocationVehicleInfo.VehicleStatus status;
    @ApiModelProperty("备注")
    private String remark;

    private Integer count;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelCode() {
        return modelCode;
    }

    public void setModelCode(String modelCode) {
        this.modelCode = modelCode;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public String getColorCode() {
        return colorCode;
    }

    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

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

    public Long getSeriesId() {
        return seriesId;
    }

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

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public Date getOffLineDate() {
        return offLineDate;
    }

    public void setOffLineDate(Date offLineDate) {
        this.offLineDate = offLineDate;
    }

    public LocationVehicleInfo.VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(LocationVehicleInfo.VehicleStatus status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }
}