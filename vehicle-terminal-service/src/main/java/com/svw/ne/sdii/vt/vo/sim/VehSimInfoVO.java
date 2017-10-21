package com.svw.ne.sdii.vt.vo.sim;

import io.swagger.annotations.ApiModelProperty;

/**
 * SIM卡信息
 * Created by andy on 2017/3/31.
 */
public class VehSimInfoVO extends VehicleSim {

    @ApiModelProperty("设备编号")
    private String deviceSn;
    @ApiModelProperty("设备类型")
    private String modelName;
    @ApiModelProperty("IMEI")
    private String imei;
    @ApiModelProperty("车辆vin")
    private String vin;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

}
