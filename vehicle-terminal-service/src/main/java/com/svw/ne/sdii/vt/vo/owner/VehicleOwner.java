package com.svw.ne.sdii.vt.vo.owner;

import com.svw.ne.sdii.vt.enumtype.CertificateType;
import com.svw.ne.sdii.vt.enumtype.GenderType;
import com.svw.ne.sdii.vt.enumtype.PackageStatus;
import com.svw.ne.sdii.vt.enumtype.SaleRelationType;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yong.liu on 2016/12/7.
 * 车主
 */
public class VehicleOwner extends BaseObjct {

    @ApiModelProperty("名")
    private String firstName;
    @ApiModelProperty("姓")
    private String lastName;
    @ApiModelProperty("姓名")
    private String ownerName;
    @ApiModelProperty(value = "性别", allowableValues = "M/F")
    private GenderType gender;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty(value = "证件类型", allowableValues = "ID_CARD")
    private CertificateType idType;
    @ApiModelProperty(value = "证件号码")
    private String idNumber;
    @ApiModelProperty(value = "生日")
    private String birthday;
    @ApiModelProperty(value = "手机号码")
    private String mobilePhone;
    @ApiModelProperty(value = "家庭电话")
    private String homePhone;
    @ApiModelProperty(value = "地址")
    private String address;
    @ApiModelProperty(value = "国家代码")
    private String countryCode;
    @ApiModelProperty(value = "省代码")
    private String provinceCode;
    @ApiModelProperty(value = "城市代码")
    private String cityCode;
    @ApiModelProperty(value = "区县代码")
    private String districtCode;
    @ApiModelProperty(value = "紧急联系人")
    private String emergencyContact;
    @ApiModelProperty(value = "经销商ID")
    private Long dealerId;
    @ApiModelProperty(value = "经销商名")
    private String dealerName;
    @ApiModelProperty(value = "车辆VIN码")
    private String vin;
    @ApiModelProperty(value = "车辆牌照")
    private String licensePlate;
    @ApiModelProperty(value = "车型ID")
    private Long modelId;
    @ApiModelProperty(value = "车型名称")
    private String modelName;
    @ApiModelProperty(value = "颜色ID")
    private Long colorId;
    @ApiModelProperty(value = "车辆颜色名称")
    private String colorName;
    @ApiModelProperty(value = "品牌ID")
    private Long brandId;
    @ApiModelProperty(value = "车辆品牌")
    private String brandName;
    @ApiModelProperty(value = "车系ID")
    private Long seriesId;
    @ApiModelProperty(value = "车系名称")
    private String seriesName;
    @ApiModelProperty(value = "购车时间")
    private Date saleDate;
    @ApiModelProperty(value = "车主与车辆关系")
    private SaleRelationType relationType = SaleRelationType.OLD_OWN;
    @ApiModelProperty("设备ID")
    private Long deviceId;
    @ApiModelProperty("设备号")
    private String deviceSN;
    @ApiModelProperty("SIM卡ID")
    private Long simId;
    @ApiModelProperty("SIM卡号")
    private String simNumber;
    @ApiModelProperty(value = "用户名")
    private  String userName;
    @ApiModelProperty("账户id")
    private Long accountId;
    @ApiModelProperty("车辆发动机号")
    private String engineNumber;
    @ApiModelProperty("开通T服务状态")
    private PackageStatus tServerStatus;
    @ApiModelProperty(value = "开通T服务时间")
    private Date tServerStartTime;

    public SaleRelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(SaleRelationType relationType) {
        this.relationType = relationType;
    }

    public PackageStatus gettServerStatus() {
        return tServerStatus;
    }

    public void settServerStatus(PackageStatus tServerStatus) {
        this.tServerStatus = tServerStatus;
    }

    public Date gettServerStartTime() {
        return tServerStartTime;
    }

    public void settServerStartTime(Date tServerStartTime) {
        this.tServerStartTime = tServerStartTime;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public CertificateType getIdType() {
        return idType;
    }

    public void setIdType(CertificateType idType) {
        this.idType = idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public String getDistrictCode() {
        return districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
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

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
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

    public Long getSimId() {
        return simId;
    }

    public void setSimId(Long simId) {
        this.simId = simId;
    }

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }


}
