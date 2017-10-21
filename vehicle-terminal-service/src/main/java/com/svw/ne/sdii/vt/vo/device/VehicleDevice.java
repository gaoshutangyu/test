package com.svw.ne.sdii.vt.vo.device;

import com.svw.ne.sdii.vt.enumtype.DeviceStatus;
import com.svw.ne.sdii.vt.enumtype.InstallStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import com.svw.ne.sdii.vt.vo.sim.VehSimInfoVO;
import com.svw.ne.sdii.vt.vo.vehicle.VehicleBaseInfo;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by yong.liu on 2016/12/7.
 */
public class VehicleDevice extends BaseObjct {

    @ApiModelProperty(value = "序列号", required = true)
    private String sn;
    @ApiModelProperty("国际移动设备识别号")
    private String imei;
    @ApiModelProperty(value = "设备的状态", allowableValues = "VALID已安装/UNINSTALLED未安装/DISABLE已作废")
    private DeviceStatus status;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("安装id")
    private Long installId;
    @ApiModelProperty("设备与车的安装日期")
    private Date installDate;
    @ApiModelProperty("设备与车的解绑日期")
    private Date uninstallDate;
    @ApiModelProperty("设备与车的安装状态")
    private InstallStatus installStatus;
    @ApiModelProperty("设备与车的安装备注")
    private String installRemark;
    @ApiModelProperty("车辆id")
    private Long vehicleId;
    @ApiModelProperty("车辆VIN")
    private String vin;
    @ApiModelProperty("车牌号")
    private String licensePlate;
    @ApiModelProperty("车主姓名")
    private String ownerName;
    @ApiModelProperty("经销商名称")
    private String dealerName;
    @ApiModelProperty("ICCID")
    private String iccid;
    @ApiModelProperty("设备类型ID")
    private Long modelId;
    @ApiModelProperty("设备类型")
    private String modelName;
    @ApiModelProperty("设备类型别名")
    private String modelNameAlias;
    @ApiModelProperty("设备类型备注")
    private String modelRemark;
    @ApiModelProperty("设备制造商ID")
    private Long manufacturerId;
    @ApiModelProperty("设备制造商名称")
    private String manufacturerName;
    @ApiModelProperty(value = "设备与sim卡的安装状态", allowableValues = "VALID已安装/UNINSTALLED未安装/DISABLE已作废")
    private InstallStatus simdevStatus;
    @ApiModelProperty("设备与sim卡的绑定时间")
    private Date simdevInstalldate;
    @ApiModelProperty("设备与sim卡的解绑时间")
    private Date simdevUninstalldate;
    @ApiModelProperty("设备与sim卡的操作备注")
    private String simdevRemark;

    @ApiModelProperty("绑定过的车辆信息")
    private List<VehicleBaseInfo> vehInfoList;
    @ApiModelProperty("绑定过的sim卡信息")
    private List<VehSimInfoVO> simInfoList;

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getInstallId() {
        return installId;
    }

    public void setInstallId(Long installId) {
        this.installId = installId;
    }

    public Date getInstallDate() {
        return installDate;
    }

    public void setInstallDate(Date installDate) {
        this.installDate = installDate;
    }

    public Date getUninstallDate() {
        return uninstallDate;
    }

    public void setUninstallDate(Date uninstallDate) {
        this.uninstallDate = uninstallDate;
    }

    public InstallStatus getInstallStatus() {
        return installStatus;
    }

    public void setInstallStatus(InstallStatus installStatus) {
        this.installStatus = installStatus;
    }

    public String getInstallRemark() {
        return installRemark;
    }

    public void setInstallRemark(String installRemark) {
        this.installRemark = installRemark;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNameAlias() {
        return modelNameAlias;
    }

    public void setModelNameAlias(String modelNameAlias) {
        this.modelNameAlias = modelNameAlias;
    }

    public String getModelRemark() {
        return modelRemark;
    }

    public void setModelRemark(String modelRemark) {
        this.modelRemark = modelRemark;
    }

    public InstallStatus getSimdevStatus() {
        return simdevStatus;
    }

    public void setSimdevStatus(InstallStatus simdevStatus) {
        this.simdevStatus = simdevStatus;
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

    public String getSimdevRemark() {
        return simdevRemark;
    }

    public void setSimdevRemark(String simdevRemark) {
        this.simdevRemark = simdevRemark;
    }

    public List<VehicleBaseInfo> getVehInfoList() {
        return vehInfoList;
    }

    public void setVehInfoList(List<VehicleBaseInfo> vehInfoList) {
        this.vehInfoList = vehInfoList;
    }

    public List<VehSimInfoVO> getSimInfoList() {
        return simInfoList;
    }

    public void setSimInfoList(List<VehSimInfoVO> simInfoList) {
        this.simInfoList = simInfoList;
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
}
