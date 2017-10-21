package com.svw.ne.sdii.vt.vo.vehicle;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yong.liu on 2016/12/9.
 */
public class CollectVehicle extends BaseObjct {

    @ApiModelProperty(value = "车辆VIN码", required = true)
    private String vin;
    @ApiModelProperty(value = "车型ID")
    private Long modelId;
    @ApiModelProperty(value = "颜色ID")
    private Long colorId;
    @ApiModelProperty(value = "引擎编号", required = true)
    private String engineNumber;
    @ApiModelProperty(value = "车牌号", required = true)
    private String licensePlate;
    @ApiModelProperty(value = "下线时间")
    private Date offLineDate;
    @ApiModelProperty(value = "车辆状态", allowableValues = "VALID有效／RESALE已转卖／WRITTENOFF已报废")
    private LocationVehicleInfo.VehicleStatus status;
    @ApiModelProperty("备注")
    private String remark;

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

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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
}
