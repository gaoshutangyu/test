package com.svw.ne.sdii.vt.vo.device;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import com.svw.ne.sdii.vt.vo.sim.VehicleSim;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/6/6.
 */
public class VehicleDevSimVO extends BaseObjct {
    @ApiModelProperty("设备信息")
    private VehicleDevice device;
    @ApiModelProperty("sim卡信息")
    private VehicleSim sim;

    public VehicleDevice getDevice() {
        return device;
    }

    public void setDevice(VehicleDevice device) {
        this.device = device;
    }

    public VehicleSim getSim() {
        return sim;
    }

    public void setSim(VehicleSim sim) {
        this.sim = sim;
    }
}
