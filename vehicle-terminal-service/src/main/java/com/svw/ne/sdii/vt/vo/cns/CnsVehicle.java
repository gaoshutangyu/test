package com.svw.ne.sdii.vt.vo.cns;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import com.svw.ne.sdii.vt.vo.device.VehicleDevice;
import com.svw.ne.sdii.vt.vo.saleInfo.VehicleSaleInfo;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Create by Zhonghang.Bai on 2017年8月10日 11:40:56
 *
 * @Desc cns项目车辆信息实体
 */
public class CnsVehicle  extends BaseObjct {

    @ApiModelProperty(value = "车辆VIN码", required = true)
    private String vin;
    @ApiModelProperty(value = "状态", allowableValues = "VALID有效／RESALE已转卖／WRITTENOFF已报废")
    private String status;
    @ApiModelProperty(value = "车系")
    private String car_series;
    @ApiModelProperty(value = "车型")
    private String car_type;
    @ApiModelProperty(value = "发动机号")
    private String engine_no;
    @ApiModelProperty(value = "内饰颜色")
    private String interior_color;
    @ApiModelProperty(value = "外饰颜色")
    private String exteriors_color;
    @ApiModelProperty(value = "DID")
    private String did;
    @ApiModelProperty(value = "销售时间")
    private String sale_date;
    @ApiModelProperty(value = "下线时间")
    private String offline_date;
    @ApiModelProperty("绑定过的设备信息列表")
    private List<VehicleDevice> deviceList;
    @ApiModelProperty("购车信息列表")
    private List<VehicleSaleInfo> saleInfoList;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCar_series() {
        return car_series;
    }

    public void setCar_series(String car_series) {
        this.car_series = car_series;
    }

    public String getCar_type() {
        return car_type;
    }

    public void setCar_type(String car_type) {
        this.car_type = car_type;
    }

    public String getEngine_no() {
        return engine_no;
    }

    public void setEngine_no(String engine_no) {
        this.engine_no = engine_no;
    }

    public String getInterior_color() {
        return interior_color;
    }

    public void setInterior_color(String interior_color) {
        this.interior_color = interior_color;
    }

    public String getExteriors_color() {
        return exteriors_color;
    }

    public void setExteriors_color(String exteriors_color) {
        this.exteriors_color = exteriors_color;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getOffline_date() {
        return offline_date;
    }

    public void setOffline_date(String offline_date) {
        this.offline_date = offline_date;
    }
    public List<VehicleDevice> getDeviceList() {
        return deviceList;
    }

    public void setDeviceList(List<VehicleDevice> deviceList) {
        this.deviceList = deviceList;
    }

    public List<VehicleSaleInfo> getSaleInfoList() {
        return saleInfoList;
    }

    public void setSaleInfoList(List<VehicleSaleInfo> saleInfoList) {
        this.saleInfoList = saleInfoList;
    }

    public String getSale_date() {
        return sale_date;
    }

    public void setSale_date(String sale_date) {
        this.sale_date = sale_date;
    }
}
