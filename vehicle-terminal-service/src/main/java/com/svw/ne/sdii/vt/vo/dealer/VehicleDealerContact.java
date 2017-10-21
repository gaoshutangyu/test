package com.svw.ne.sdii.vt.vo.dealer;

import com.svw.ne.sdii.vt.enumtype.ContactType;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 经销商联系人
 */
public class VehicleDealerContact {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "联系人类型", allowableValues = "SALES/AFTER_SALES/RESCUE/EMERGENCY_CONTACT")
    private ContactType contactType;
    @ApiModelProperty("称呼")
    private String contactTitle;
    @ApiModelProperty(value = "姓名", required = true)
    private String name;
    @ApiModelProperty("地址")
    private String address;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("电话")
    private String phone;
    @ApiModelProperty("经销商ID")
    private Long dealerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ContactType getContactType() {
        return contactType;
    }

    public void setContactType(ContactType contactType) {
        this.contactType = contactType;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }
}
