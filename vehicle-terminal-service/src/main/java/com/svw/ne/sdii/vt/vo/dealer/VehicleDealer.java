package com.svw.ne.sdii.vt.vo.dealer;

import com.svw.ne.sdii.vt.enumtype.DealerStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by yong.liu on 2016/12/7.
 * 经销商
 */
public class VehicleDealer extends BaseObjct {

    @ApiModelProperty("品牌ID")
    private Long brandId;
    @ApiModelProperty("品牌名")
    private String brandName;
    @ApiModelProperty("父级ID")
    private Long parentId;
    @ApiModelProperty("父级名称")
    private String parentName;
    @ApiModelProperty(value = "类型", allowableValues = "4S/2S/REPAIR_SITE/VIRTUAL")
    private String dealerType;
    @ApiModelProperty(value = "名称", required = true)
    private String name;
    @ApiModelProperty(value = "代码", required = true)
    private String code;
    @ApiModelProperty("代码2")
    private String code2;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("联系人名称")
    private String contactName;
    @ApiModelProperty("联系人电话")
    private String contactPhone;
    @ApiModelProperty("销售经理名称")
    private String saleName;
    @ApiModelProperty("销售电话")
    private String salePhone;
    @ApiModelProperty("售后服务经理名称")
    private String afterSaleName;
    @ApiModelProperty("售后服务电话")
    private String afterSalePhone;
    @ApiModelProperty("救援电话")
    private String rescuePhone;
    @ApiModelProperty("开业时间")
    private Date openTime;
    @ApiModelProperty("退网时间")
    private Date closeTime;
    @ApiModelProperty("经度")
    private String longitude;
    @ApiModelProperty("纬度")
    private String latitude;
    @ApiModelProperty("图片地址")
    private String imageUrl;
    @ApiModelProperty("国家代码")
    private String countryCode;
    @ApiModelProperty("省代码")
    private String provinceCode;
    @ApiModelProperty("城市代码")
    private String cityCode;
    @ApiModelProperty("区县代码")
    private String districtCode;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty(value = "状态", allowableValues = "ACTIVE／INACTIVE")
    private DealerStatus status;

    // 子经销商总数（包含所有的子节点和孙子节点）
    private Integer allChildrenDealerNum = new Integer(0);
    // 子经销商车辆总数（包含所有的子节点和孙子节点）
    private Integer allChildrenDealerVehNum = new Integer(0);

    private List<VehicleDealerContact> vehicleDealerContacts = new ArrayList<VehicleDealerContact>();

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getAfterSaleName() {
        return afterSaleName;
    }

    public void setAfterSaleName(String afterSaleName) {
        this.afterSaleName = afterSaleName;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getDealerType() {
        return dealerType;
    }

    public void setDealerType(String dealerType) {
        this.dealerType = dealerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getSalePhone() {
        return salePhone;
    }

    public void setSalePhone(String salePhone) {
        this.salePhone = salePhone;
    }

    public String getAfterSalePhone() {
        return afterSalePhone;
    }

    public void setAfterSalePhone(String afterSalePhone) {
        this.afterSalePhone = afterSalePhone;
    }

    public String getRescuePhone() {
        return rescuePhone;
    }

    public void setRescuePhone(String rescuePhone) {
        this.rescuePhone = rescuePhone;
    }

    public Date getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Date openTime) {
        this.openTime = openTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DealerStatus getStatus() {
        return status;
    }

    public void setStatus(DealerStatus status) {
        this.status = status;
    }

    public Integer getAllChildrenDealerNum() {
        return allChildrenDealerNum;
    }

    public void setAllChildrenDealerNum(Integer allChildrenDealerNum) {
        this.allChildrenDealerNum = allChildrenDealerNum;
    }

    public Integer getAllChildrenDealerVehNum() {
        return allChildrenDealerVehNum;
    }

    public void setAllChildrenDealerVehNum(Integer allChildrenDealerVehNum) {
        this.allChildrenDealerVehNum = allChildrenDealerVehNum;
    }

    public List<VehicleDealerContact> getVehicleDealerContacts() {
        return vehicleDealerContacts;
    }

    public void setVehicleDealerContacts(List<VehicleDealerContact> vehicleDealerContacts) {
        this.vehicleDealerContacts = vehicleDealerContacts;
    }
}
