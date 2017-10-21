package com.svw.ne.sdii.vt.vo;

import com.svw.ne.sdii.vt.enumtype.PackageStatus;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by dogchen on 2017/4/10.
 */
public class VehicleServiceRel {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("车辆id")
    private Long vehicleId;
    @ApiModelProperty("开始时间")
    private Date startTime;
    @ApiModelProperty("状态")
    private PackageStatus status;
    @ApiModelProperty("套餐")
    private Integer servicePackage;
    @ApiModelProperty("到期时间")
    private Date expiredTime;
    @ApiModelProperty("套餐名称")
    private String packageName;
    @ApiModelProperty("关闭时间")
    private Date closeTime;
    @ApiModelProperty(value = "开通者", allowableValues = "owner,dealer")
    private String opener;
    @ApiModelProperty("单据编号")
    private String formId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public PackageStatus getStatus() {
        return status;
    }

    public void setStatus(PackageStatus status) {
        this.status = status;
    }

    public Integer getServicePackage() {
        return servicePackage;
    }

    public void setServicePackage(Integer servicePackage) {
        this.servicePackage = servicePackage;
    }

    public Date getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Date expiredTime) {
        this.expiredTime = expiredTime;
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getOpener() {
        return opener;
    }

    public void setOpener(String opener) {
        this.opener = opener;
    }

    public String getFormId() {
        return formId;
    }

    public void setFormId(String formId) {
        this.formId = formId;
    }
}
