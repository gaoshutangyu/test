package com.svw.ne.sdii.vt.vo.sim;

import com.svw.ne.sdii.vt.enumtype.SimStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yong.liu on 2016/12/20.
 */
public class CollectVehicleSim extends BaseObjct {

    @ApiModelProperty(value = "SIM卡号")
    private String iccid;
    @ApiModelProperty(value = "电话号码")
    private String number;
    @ApiModelProperty("激活时间")
    private Date activeDate;
    @ApiModelProperty("imsi")
    private String imsi;
    @ApiModelProperty("运营商ID")
    private Long carrierId;
    @ApiModelProperty(value = "SIM卡的状态",allowableValues = "ACTIVE激活/INACTIVE未激活/DISABLED作废")
    private SimStatus status;
    @ApiModelProperty("SIM卡的采购时间")
    private Date purchaseDate;
    @ApiModelProperty("SIM卡的失效时间")
    private Date failureDate;
//    @ApiModelProperty("SIM卡的已用流量")
//    private String usedFlow;
//    @ApiModelProperty("SIM卡的总流量")
//    private String totalFlow;
    @ApiModelProperty("套餐ID")
    private Long packageId;

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

    public Long getCarrierId() {
        return carrierId;
    }

    public void setCarrierId(Long carrierId) {
        this.carrierId = carrierId;
    }

    public SimStatus getStatus() {
        return status;
    }

    public void setStatus(SimStatus status) {
        this.status = status;
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

    public Long getPackageId() {
        return packageId;
    }

    public void setPackageId(Long packageId) {
        this.packageId = packageId;
    }
}
