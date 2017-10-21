package com.svw.ne.sdii.vt.vo.device;

import com.svw.ne.sdii.vt.enumtype.InstallStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import com.svw.ne.sdii.vt.vo.sim.VehicleSim;
import com.svw.ne.sdii.vt.vo.vehicle.Vehicle;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yong.liu on 2016/12/7.
 * 设备安装信息
 */
public class VehicleDeviceInstallation extends BaseObjct {
    @ApiModelProperty("车辆ID")
    private Long vehicleId;
    @ApiModelProperty("设备ID")
    private Long deviceId;
    @ApiModelProperty("设备sn")
    private String deviceSn;
    @ApiModelProperty("设备的安装日期")
    private Date installDate;
    @ApiModelProperty("sim id")
    private Long simId;
    @ApiModelProperty(value = "设备的安装状态", allowableValues = "VALID/UNINSTALLED")
    private InstallStatus status;
    @ApiModelProperty("设备与车的备注")
    private String remark;
    private Vehicle vehicle;
    private VehicleDevice vehicleDevice;
    private VehicleSim vehicleSim;
    @ApiModelProperty("设备的解绑日期")
    private Date uninstallDate;
    @ApiModelProperty("设备与SIM的备注")
    private String simdevRemark;
    @ApiModelProperty(value = "设备与SIM的绑定状态", allowableValues = "VALID/UNINSTALLED")
    private InstallStatus simdevStatus;
    @ApiModelProperty("SIM的绑定时间")
    private Date simdevInstalldate;
    @ApiModelProperty("SIM的解绑时间")
    private Date simdevUninstalldate;

    public Date getUninstallDate() {
        return uninstallDate;
    }

    public void setUninstallDate(Date uninstallDate) {
        this.uninstallDate = uninstallDate;
    }

    public String getSimdevRemark() {
        return simdevRemark;
    }

    public void setSimdevRemark(String simdevRemark) {
        this.simdevRemark = simdevRemark;
    }

    public InstallStatus getSimdevStatus() {
        return simdevStatus;
    }

    public void setSimdevStatus(InstallStatus simdevStatus) {
        this.simdevStatus = simdevStatus;
    }

    public void setStatus(InstallStatus status) {
        this.status = status;
    }

    public InstallStatus getStatus() {
        return status;
    }

    public Date getSimdevInstalldate() {
        return simdevInstalldate;
    }

    public void setSimdevInstalldate(Date simdevInstalldate) {
        this.simdevInstalldate = simdevInstalldate;
    }

    public Date getSimdevUninstalldate() {
        return simdevUninstalldate;
    }

    public void setSimdevUninstalldate(Date simdevUninstalldate) {
        this.simdevUninstalldate = simdevUninstalldate;
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

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public Long getSimId() {
        return simId;
    }

    public void setSimId(Long simId) {
        this.simId = simId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleDevice getVehicleDevice() {
        return vehicleDevice;
    }

    public void setVehicleDevice(VehicleDevice vehicleDevice) {
        this.vehicleDevice = vehicleDevice;
    }

    public VehicleSim getVehicleSim() {
        return vehicleSim;
    }

    public void setVehicleSim(VehicleSim vehicleSim) {
        this.vehicleSim = vehicleSim;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }
}
