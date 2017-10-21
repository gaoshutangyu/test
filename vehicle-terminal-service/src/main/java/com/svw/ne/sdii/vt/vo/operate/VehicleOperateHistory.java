package com.svw.ne.sdii.vt.vo.operate;

import com.svw.ne.sdii.vt.enumtype.HistroyType;
import com.svw.ne.sdii.vt.enumtype.OperateType;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/5/25.
 * 操作历史记录
 */
public class VehicleOperateHistory extends BaseObjct {

    @ApiModelProperty(value = "操作历史记录类型", allowableValues = "DEVICE_VEHICLE,SIM_DEVICE,OWNER_VEHICLE")
    private HistroyType histroyType;
    @ApiModelProperty("simId")
    private Long simId;
    @ApiModelProperty("vehicleId")
    private Long vehicleId;
    @ApiModelProperty("deviceId")
    private Long deviceId;
    @ApiModelProperty("ownerId")
    private Long ownerId;
    @ApiModelProperty("sim卡ICCID")
    private String iccid;
    @ApiModelProperty("vin")
    private String vin;
    @ApiModelProperty("设备号")
    private String deviceSn;
    @ApiModelProperty("身份证号码")
    private String idNumber;
    @ApiModelProperty(value = "操作类型", allowableValues = "BIND,UNBIND,CHANGE,WRITEOFF")
    private OperateType operateType;
    @ApiModelProperty(value = "操作描述")
    private String description;
    @ApiModelProperty(value = "备注")
    private String remark;

    public VehicleOperateHistory() {
    }

    public VehicleOperateHistory(HistroyType histroyType, Long simId, Long vehicleId, Long deviceId, Long ownerId, OperateType operateType, String description, String remark) {
        this.histroyType = histroyType;
        this.simId = simId;
        this.vehicleId = vehicleId;
        this.deviceId = deviceId;
        this.ownerId = ownerId;
        this.operateType = operateType;
        this.description = description;
        this.remark = remark;
    }

    public HistroyType getHistroyType() {
        return histroyType;
    }

    public void setHistroyType(HistroyType histroyType) {
        this.histroyType = histroyType;
    }

    public Long getSimId() {
        return simId;
    }

    public void setSimId(Long simId) {
        this.simId = simId;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public OperateType getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateType operateType) {
        this.operateType = operateType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
