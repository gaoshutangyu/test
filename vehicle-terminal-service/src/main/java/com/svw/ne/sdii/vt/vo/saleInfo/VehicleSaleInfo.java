package com.svw.ne.sdii.vt.vo.saleInfo;

import com.svw.ne.sdii.vt.enumtype.SaleRelationType;
import com.svw.ne.sdii.vt.vo.dealer.VehicleDealer;
import com.svw.ne.sdii.vt.vo.owner.VehicleOwner;
import com.svw.ne.sdii.vt.vo.vehicle.Vehicle;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * Created by yong.liu on 2016/12/7.
 * 车辆销售信息
 */
public class VehicleSaleInfo {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "车辆ID", required = true)
    private Long vehicleId;
    @ApiModelProperty(value = "车主ID", required = true)
    private Long ownerId;
    @ApiModelProperty(value = "经销商ID", required = true)
    private Long dealerId;
    @ApiModelProperty(value = "销售时间")
    private Date saleDate;
    @ApiModelProperty(value = "与车主关系", allowableValues = "OWNED当前拥有关系/OLD_OWN历史拥有关系")
    private SaleRelationType relationType;
    @ApiModelProperty(value = "车牌号")
    private String licensePlate;
    @ApiModelProperty(value = "解绑时间")
    private Date unbindDate;
    @ApiModelProperty(value = "车主姓名")
    private String ownerName;

    private Vehicle vehicle;
    private VehicleOwner vehicleOwner;
    private VehicleDealer vehicleDealer;

    public VehicleSaleInfo() {
    }

    public VehicleSaleInfo(SaleRelationType relationType) {
        this.relationType = relationType;
    }

    public VehicleSaleInfo(Long vehicleId, Long ownerId, Long dealerId) {
        this.vehicleId = vehicleId;
        this.ownerId = ownerId;
        this.dealerId = dealerId;
    }


    public VehicleSaleInfo(Long id, Long vehicleId, Long ownerId, Long dealerId, Date saleDate, SaleRelationType relationType, String licensePlate, Date unbindDate) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.ownerId = ownerId;
        this.dealerId = dealerId;
        this.saleDate = saleDate;
        this.relationType = relationType;
        this.licensePlate = licensePlate;
        this.unbindDate = unbindDate;
    }

    public Date getUnbindDate() {
        return unbindDate;
    }

    public void setUnbindDate(Date unbindDate) {
        this.unbindDate = unbindDate;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

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

    public Long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }

    public SaleRelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(SaleRelationType relationType) {
        this.relationType = relationType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleOwner getVehicleOwner() {
        return vehicleOwner;
    }

    public void setVehicleOwner(VehicleOwner vehicleOwner) {
        this.vehicleOwner = vehicleOwner;
    }

    public VehicleDealer getVehicleDealer() {
        return vehicleDealer;
    }

    public void setVehicleDealer(VehicleDealer vehicleDealer) {
        this.vehicleDealer = vehicleDealer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VehicleSaleInfo that = (VehicleSaleInfo) o;

        return relationType == that.relationType;
    }

    @Override
    public int hashCode() {
        return relationType.hashCode();
    }
}
