package com.svw.ne.sdii.vt.vo;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by dogchen on 2017/4/11.
 */
public class VehicleUserRel extends BaseObjct{
    @ApiModelProperty("用户手机号")
    private String userName;
    @ApiModelProperty("账户id")
    private Long accountId;
    @ApiModelProperty("车辆id")
    private Long vehicleId;
    @ApiModelProperty(value = "是否默认", allowableValues = "default/none")
    private String status;
    @ApiModelProperty("vin码")
    private String vin;
    @ApiModelProperty("车主id")
    private String ownerId;
    @ApiModelProperty("车主姓名")
    private String ownerName;
    @ApiModelProperty("车主身份证")
    private String idNumber;
    @ApiModelProperty("车主性别")
    private String gender;
    @ApiModelProperty("车牌号")
    private String licensePlate;
    @ApiModelProperty("昵称")
    private String nickname;
    @ApiModelProperty("紧急联系人")
    private String emergencyContact;
    @ApiModelProperty("保险公司电话")
    private String insurancePhone;
    @ApiModelProperty("经销商名")
    private String dealerName;
    @ApiModelProperty("金牌服务热线")
    private String afterSalePhone;
    @ApiModelProperty("套餐名")
    private String packageName;
    @ApiModelProperty("套餐开始时间")
    private Date startTime;
    @ApiModelProperty("套餐结束时间")
    private Date endTime;
    @ApiModelProperty("PIN码")
    private String pin;
    @ApiModelProperty("经销商经度")
    private Double dealerLongitude;
    @ApiModelProperty("经销商纬度")
    private Double dealerLatitude;
    @ApiModelProperty("经销商联系人姓名")
    private String dealerContactName;
    @ApiModelProperty("经销商地址")
    private String dealerAddress;
    @ApiModelProperty("经销商id")
    private Long dealerId;
    @ApiModelProperty(value = "过滤查询时间字段", allowableValues = "start_time,end_time")
    private String filterField;
    @ApiModelProperty(value = "套餐状态", allowableValues = "using,expired,closed,failed")
    private String packageStatus;
    @ApiModelProperty("车型名称")
    private String modelName;
    @ApiModelProperty("表单id")
    private String formId;
    @ApiModelProperty("开通者")
    private String opener;
    public VehicleUserRel() {
    }

    public VehicleUserRel(String userName, Long vehicleId, String status) {
        this.userName = userName;
        this.vehicleId = vehicleId;
        this.status = status;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getAfterSalePhone() {
        return afterSalePhone;
    }

    public void setAfterSalePhone(String afterSalePhone) {
        this.afterSalePhone = afterSalePhone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getInsurancePhone() {
        return insurancePhone;
    }

    public void setInsurancePhone(String insurancePhone) {
        this.insurancePhone = insurancePhone;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Double getDealerLongitude() {
        return dealerLongitude;
    }

    public void setDealerLongitude(Double dealerLongitude) {
        this.dealerLongitude = dealerLongitude;
    }

    public Double getDealerLatitude() {
        return dealerLatitude;
    }

    public void setDealerLatitude(Double dealerLatitude) {
        this.dealerLatitude = dealerLatitude;
    }

    public String getDealerContactName() {
        return dealerContactName;
    }

    public void setDealerContactName(String dealerContactName) {
        this.dealerContactName = dealerContactName;
    }

    public String getDealerAddress() {
        return dealerAddress;
    }

    public void setDealerAddress(String dealerAddress) {
        this.dealerAddress = dealerAddress;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public String getFilterField() {
        return filterField;
    }

    public void setFilterField(String filterField) {
        this.filterField = filterField;
    }

    public String getPackageStatus() {
        return packageStatus;
    }

    public void setPackageStatus(String packageStatus) {
        this.packageStatus = packageStatus;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }

    public String getOpener() {
        return opener;
    }

    public void setOpener(String opener) {
        this.opener = opener;
    }
}
