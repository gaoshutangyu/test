package com.svw.ne.sdii.vt.vo.owner;

import com.svw.ne.sdii.vt.enumtype.CertificateType;
import com.svw.ne.sdii.vt.enumtype.ContactType;
import com.svw.ne.sdii.vt.enumtype.GenderType;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 车主联系人
 */
public class VehicleOwnerContact {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("名")
    private String firstName;
    @ApiModelProperty("姓")
    private String lastName;
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
    @ApiModelProperty(value = "生日")
    private String mobilePhone;
    @ApiModelProperty(value = "家庭电话")
    private String homePhone;
    @ApiModelProperty(value = "地址")
    private String addresss;
    @ApiModelProperty(value = "国家代码")
    private String countryCode;
    @ApiModelProperty(value = "省代码")
    private String provinceCode;
    @ApiModelProperty(value = "城市代码")
    private String cityCode;
    @ApiModelProperty(value = "区县代码")
    private String districtCode;
    @ApiModelProperty(value = "经销商ID")
    private String dealerId;
    @ApiModelProperty(value = "经销商名")
    private String dealerName;
    @ApiModelProperty("车主ID")
    private Long ownerId;
    @ApiModelProperty(value = "联系人类型", allowableValues = "EMERGENCY_CONTACT紧急联系人/SALES销售联系人/" +
            "AFTER_SALES售后联系人/RESCUE救援联系人")
    private ContactType contactType;
    private VehicleOwner vehicleOwner;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
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

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public VehicleOwner getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(VehicleOwner vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public String getDealerId() {
        return dealerId;
    }

    public void setDealerId(String dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }
}
