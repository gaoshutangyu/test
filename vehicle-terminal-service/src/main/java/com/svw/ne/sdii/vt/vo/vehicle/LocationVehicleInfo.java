package com.svw.ne.sdii.vt.vo.vehicle;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/5/26.
 * 含有位置信息的vehicle数据
 */
public class LocationVehicleInfo extends VehicleInfo{
    /**
     * 车辆状态（在线，离线，失联，未监控，过期）
     * 在线：上次上报数据在五分钟以内
     * 离线：上次上报数据大于五分钟，离线时间需要显示出来（例如：>30分钟）
     * 未监控：从未上报过数据（默认状态）
     */
    public enum VehicleStatus {
        ONLINE, OFFLINE, NOT_MONITOR;
    }

    @ApiModelProperty("车辆状态")
    private VehicleStatus vehicleStatus = VehicleStatus.NOT_MONITOR;
    @ApiModelProperty("离线时间")
    private String offlineTime;

    @ApiModelProperty("经度")
    private String longitude;
    @ApiModelProperty("纬度")
    private String latitude;
    @ApiModelProperty("数据上报时间")
    private Long acquisitionTime;
    @ApiModelProperty("方向")
    private String direction;

    public VehicleStatus getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(VehicleStatus vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public String getOfflineTime() {
        return offlineTime;
    }

    public void setOfflineTime(String offlineTime) {
        this.offlineTime = offlineTime;
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

    public Long getAcquisitionTime() {
        return acquisitionTime;
    }

    public void setAcquisitionTime(Long acquisitionTime) {
        this.acquisitionTime = acquisitionTime;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
