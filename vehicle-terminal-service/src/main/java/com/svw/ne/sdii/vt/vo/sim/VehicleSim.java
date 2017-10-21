package com.svw.ne.sdii.vt.vo.sim;

import com.svw.ne.sdii.vt.enumtype.InstallStatus;
import com.svw.ne.sdii.vt.enumtype.SimStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by yong.liu on 2016/12/7.
 * SIM卡信息
 */
public class VehicleSim extends BaseObjct {

    @ApiModelProperty(value = "SIM卡号")
    private String iccid;
    @ApiModelProperty(value = "电话号码")
    private String number;
    @ApiModelProperty("激活时间")
    private Date activeDate;
    @ApiModelProperty("imsi")
    private String imsi;
    @ApiModelProperty(value = "SIM卡的状态",allowableValues = "ACTIVE激活/INACTIVE未激活/DISABLED作废")
    private SimStatus status;
    @ApiModelProperty("SIM卡的采购时间")
    private Date purchaseDate = new Date();
    @ApiModelProperty("SIM卡的失效时间")
    private Date failureDate;
//    @ApiModelProperty("SIM卡的已用流量")
//    private String usedFlow;
//    @ApiModelProperty("SIM卡的总流量")
//    private String totalFlow;
    @ApiModelProperty("运营商ID")
    private Long carrierId;
    @ApiModelProperty("运营商名称")
    private String carrierName;
    @ApiModelProperty("运营商别名")
    private String carrierNameAlias;
    @ApiModelProperty("国家代码")
    private String carrierCountryCode;
    @ApiModelProperty("套餐名称")
    private String packageName;
    @ApiModelProperty("套餐ID")
    private Long packageId;

    @ApiModelProperty(value = "与设备的安装状态", allowableValues = "VALID/UNINSTALLED/DISABLE")
    private InstallStatus simdevStatus;
    @ApiModelProperty("与设备的绑定时间")
    private Date simdevInstalldate;
    @ApiModelProperty("与设备的解绑时间")
    private Date simdevUninstalldate;
    @ApiModelProperty("与设备的操作备注")
    private String simdevRemark;
    @ApiModelProperty("设备编号")
    private String deviceSn;
    @ApiModelProperty("车辆vin")
    private String vin;

    private List<VehSimInfoVO> vehSimInfoVOs;

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getActiveDate() {
        return activeDate;
    }

    public void setActiveDate(Date activeDate) {
        this.activeDate = activeDate;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Date getFailureDate() {
        return failureDate;
    }

    public void setFailureDate(Date failureDate) {
        this.failureDate = failureDate;
    }

 /*   public String getUsedFlow() {
        return usedFlow;
    }

    public void setUsedFlow(String usedFlow) {
        this.usedFlow = usedFlow;
    }

    public String getTotalFlow() {
        return totalFlow;
    }

    public void setTotalFlow(String totalFlow) {
        this.totalFlow = totalFlow;
    }*/

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }

    public String getCarrierNameAlias() {
        return carrierNameAlias;
    }

    public void setCarrierNameAlias(String carrierNameAlias) {
        this.carrierNameAlias = carrierNameAlias;
    }

    public String getCarrierCountryCode() {
        return carrierCountryCode;
    }

    public void setCarrierCountryCode(String carrierCountryCode) {
        this.carrierCountryCode = carrierCountryCode;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }

    public SimStatus getStatus() {
        return status;
    }

    public void setStatus(SimStatus status) {
        this.status = status;
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

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public List<VehSimInfoVO> getVehSimInfoVOs() {
        return vehSimInfoVOs;
    }

    public void setVehSimInfoVOs(List<VehSimInfoVO> vehSimInfoVOs) {
        this.vehSimInfoVOs = vehSimInfoVOs;
    }
}
