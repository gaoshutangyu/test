package com.svw.ne.sdii.vt.vo.brand;


import com.svw.ne.sdii.vt.vo.series.VehicleSeriesAttribute;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yong.liu on 2016/12/8.
 * 车辆属性
 */
public class VehicleBrandAttribute extends VehicleBrand {
    private List<VehicleSeriesAttribute> vehicleSeriesList = new ArrayList<VehicleSeriesAttribute>();

    public List<VehicleSeriesAttribute> getVehicleSeriesList() {
        return vehicleSeriesList;
    }

    public void setVehicleSeriesList(List<VehicleSeriesAttribute> vehicleSeriesList) {
        this.vehicleSeriesList = vehicleSeriesList;
    }
}
