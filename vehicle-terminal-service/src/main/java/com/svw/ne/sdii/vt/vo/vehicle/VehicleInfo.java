package com.svw.ne.sdii.vt.vo.vehicle;

import com.svw.ne.sdii.vt.enumtype.InstallStatus;
import com.svw.ne.sdii.vt.enumtype.SaleRelationType;
import com.svw.ne.sdii.vt.vo.device.VehicleDevice;
import com.svw.ne.sdii.vt.vo.saleInfo.VehicleSaleInfo;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by yong.liu on 2016/12/7.
 */
//@lombok
public class VehicleInfo extends VehicleBaseInfo {
    @ApiModelProperty("设备ID")
    private Long deviceId;
    @ApiModelProperty("设备号")
    private String deviceSN;
    @ApiModelProperty("设备类型ID")
    private Long deviceModelId;
    @ApiModelProperty("设备类型名称")
    private String deviceModelName;
    @ApiModelProperty("设备制造商ID")
    private Long deviceManufacturerID;
    @ApiModelProperty("设备制造商名称")
    private String deviceManufacturerName;
    @ApiModelProperty("SIM卡ID")
    private Long simId;
    @ApiModelProperty("SIM卡IMSI")
    private String imsi;
    @ApiModelProperty("SIM卡号")
    private String simNumber;
    @ApiModelProperty("SIM卡ICCID")
    private String iccid;
    @ApiModelProperty("销售信息ID")
    private Long saleInfoId;
    @ApiModelProperty("省代码")
    private String provinceCode;
    @ApiModelProperty("市代码")
    private String cityCode;
    @ApiModelProperty("经销商ID")
    private Long dealerId;
    @ApiModelProperty("经销商名称")
    private String dealerName;
    @ApiModelProperty("车辆的安装状态")
    private InstallStatus vehDevInstallStatus;
    @ApiModelProperty("车辆是否绑定车主")
    private SaleRelationType vehOwnerSaleStatus;
    @ApiModelProperty("sim卡失效时间")
    private Date simFailureDate;
    @ApiModelProperty("设备绑定时间")
    private Date deviceInstallDate;
    @ApiModelProperty("车辆类型")
    private String tagType;
    @ApiModelProperty("车辆类型")
    private Long tagRelId;
    @ApiModelProperty("车辆与车主关系")
    private String saleRelationType;

    @ApiModelProperty("绑定过的设备信息列表")
    private List<VehicleDevice> deviceList;
    @ApiModelProperty("购车信息列表")
    private List<VehicleSaleInfo> saleInfoList;

    public String getSaleRelationType() {
        return saleRelationType;
    }

    public void setSaleRelationType(String saleRelationType) {
        this.saleRelationType = saleRelationType;
    }

    public Long getTagRelId() {
        return tagRelId;
    }

    public void setTagRelId(Long tagRelId) {
        this.tagRelId = tagRelId;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public InstallStatus getVehDevInstallStatus() {
        return vehDevInstallStatus;
    }

    public void setVehDevInstallStatus(InstallStatus vehDevInstallStatus) {
        this.vehDevInstallStatus = vehDevInstallStatus;
    }

    public SaleRelationType getVehOwnerSaleStatus() {
        return vehOwnerSaleStatus;
    }

    public void setVehOwnerSaleStatus(SaleRelationType vehOwnerSaleStatus) {
        this.vehOwnerSaleStatus = vehOwnerSaleStatus;
    }

    public List<VehicleDevice> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<VehicleDevice> deviceList) {
        this.deviceList = deviceList;
    }

    public List<VehicleSaleInfo> getSaleInfoList() {
        return saleInfoList;
    }

    public void setSaleInfoList(List<VehicleSaleInfo> saleInfoList) {
        this.saleInfoList = saleInfoList;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceSN() {
        return deviceSN;
    }

    public void setDeviceSN(String deviceSN) {
        this.deviceSN = deviceSN;
    }

    public Long getDeviceModelId() {
        return deviceModelId;
    }

    public void setDeviceModelId(Long deviceModelId) {
        this.deviceModelId = deviceModelId;
    }

    public Long getDeviceManufacturerID() {
        return deviceManufacturerID;
    }

    public void setDeviceManufacturerID(Long deviceManufacturerID) {
        this.deviceManufacturerID = deviceManufacturerID;
    }

    public String getDeviceManufacturerName() {
        return deviceManufacturerName;
    }

    public void setDeviceManufacturerName(String deviceManufacturerName) {
        this.deviceManufacturerName = deviceManufacturerName;
    }

    public String getDeviceModelName() {
        return deviceModelName;
    }

    public void setDeviceModelName(String deviceModelName) {
        this.deviceModelName = deviceModelName;
    }

    public Long getSimId() {
        return simId;
    }

    public void setSimId(Long simId) {
        this.simId = simId;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public Long getSaleInfoId() {
        return saleInfoId;
    }

    public void setSaleInfoId(Long saleInfoId) {
        this.saleInfoId = saleInfoId;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public Date getSimFailureDate() {
        return simFailureDate;
    }

    public void setSimFailureDate(Date simFailureDate) {
        this.simFailureDate = simFailureDate;
    }

    public Date getDeviceInstallDate() {
        return deviceInstallDate;
    }

    public void setDeviceInstallDate(Date deviceInstallDate) {
        this.deviceInstallDate = deviceInstallDate;
    }
}
