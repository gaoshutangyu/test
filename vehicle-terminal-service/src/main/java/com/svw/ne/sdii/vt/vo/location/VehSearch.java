package com.svw.ne.sdii.vt.vo.location;


import com.svw.ne.sdii.vt.vo.vehicle.LocationVehicleInfo;

/**
 * Created by xiezhouyan on 17-4-7.
 */
public class VehSearch {
    private String type;
    private String keyword;
    private String provinceCode;
    private String cityCode;
    private String dealerIds;
    private Long dealerId;
    private String ownerName;
    private String deviceSN;
    private String contract;
    private String dealerName;
    private String vin;
    private String iccid;
    private String brandName;
    private String simNumber;
    private LocationVehicleInfo.VehicleStatus status;

    public String getSimNumber() {
        return simNumber;
    }

    public void setSimNumber(String simNumber) {
        this.simNumber = simNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
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

    public String getDealerIds() {
        return dealerIds;
    }

    public void setDealerIds(String dealerIds) {
        this.dealerIds = dealerIds;
    }

    public LocationVehicleInfo.VehicleStatus getStatus() {
        return status;
    }

    public void setStatus(LocationVehicleInfo.VehicleStatus status) {
        this.status = status;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getDeviceSN() {
        return deviceSN;
    }

    public void setDeviceSN(String deviceSN) {
        this.deviceSN = deviceSN;
    }

    public String getContract() {
        return contract;
    }

    public void setContract(String contract) {
        this.contract = contract;
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

    public String getIccid() {
        return iccid;
    }

    public void setIccid(String iccid) {
        this.iccid = iccid;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
