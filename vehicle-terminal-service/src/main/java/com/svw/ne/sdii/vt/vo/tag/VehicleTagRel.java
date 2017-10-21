package com.svw.ne.sdii.vt.vo.tag;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/6/8.
 */
public class VehicleTagRel extends BaseObjct {
    @ApiModelProperty("与车辆关联id")
    private Long vehicleId;
    @ApiModelProperty("与tag关联id")
    private Long tagId;

    public Long getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(Long vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }
}
