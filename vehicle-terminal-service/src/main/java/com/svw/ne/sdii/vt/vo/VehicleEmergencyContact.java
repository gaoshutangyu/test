package com.svw.ne.sdii.vt.vo;

import com.svw.ne.sdii.vt.enumtype.CertificateType;
import com.svw.ne.sdii.vt.enumtype.GenderType;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by dogchen on 2017/4/12.
 */
public class VehicleEmergencyContact {
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
    @ApiModelProperty(value = "电话")
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
    @ApiModelProperty(value = "车辆销售id")
    private Long vehicleSaleId;

    public Long getVehicleSaleId() {
        return vehicleSaleId;
    }

    public void setVehicleSaleId(Long vehicleSaleId) {
        this.vehicleSaleId = vehicleSaleId;
    }

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

    public GenderType getGender() {
        return gender;
    }

    public void setGender(GenderType gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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


}
