package com.svw.ne.sdii.vt.vo.dealer;

import com.svw.ne.sdii.vt.vo.brand.VehicleBrand;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 经销商与品牌关联关系
 */
public class VehicleDealerBrand {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty("经销商ID")
    private Long dealerId;
    @ApiModelProperty("品牌ID")
    private Integer brandId;
    private VehicleDealer vehicleDealer;
    private VehicleBrand vehicleBrand;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDealerId() {
        return dealerId;
    }

    public void setDealerId(Long dealerId) {
        this.dealerId = dealerId;
    }

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public VehicleDealer getVehicleDealer() {
        return vehicleDealer;
    }

    public void setVehicleDealer(VehicleDealer vehicleDealer) {
        this.vehicleDealer = vehicleDealer;
    }

    public VehicleBrand getVehicleBrand() {
        return vehicleBrand;
    }

    public void setVehicleBrand(VehicleBrand vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }
}
