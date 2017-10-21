package com.svw.ne.sdii.vt.vo.device;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by andy on 2017/6/1.
 */
public class VehDeviceChangeVO extends BaseObjct {
    @ApiModelProperty("设备更换时间")
    private Date changeDate;
    @ApiModelProperty("经销商名称")
    private String dealerName;
    @ApiModelProperty("车主姓名")
    private String ownerName;
    @ApiModelProperty("车辆vin")
    private String vin;
    @ApiModelProperty("手机号码")
    private String mobilePhone;
    @ApiModelProperty("身份证号码")
    private String idNumber;
    @ApiModelProperty("新设备号")
    private String newDeviceSn;
    @ApiModelProperty("旧设备号")
    private String oldDeviceSn;

    public Date getChangeDate() {
        return changeDate;
    }

    public void setChangeDate(Date changeDate) {
        this.changeDate = changeDate;
    }

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        this.dealerName = dealerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getNewDeviceSn() {
        return newDeviceSn;
    }

    public void setNewDeviceSn(String newDeviceSn) {
        this.newDeviceSn = newDeviceSn;
    }

    public String getOldDeviceSn() {
        return oldDeviceSn;
    }

    public void setOldDeviceSn(String oldDeviceSn) {
        this.oldDeviceSn = oldDeviceSn;
    }
}

