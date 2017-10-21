package com.svw.ne.sdii.vt.vo.series;


import com.svw.ne.sdii.vt.vo.model.VehicleModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yong.liu on 2016/12/8.
 */
public class VehicleSeriesAttribute extends VehicleSeries {
    private List<VehicleModel> vehicleModelList = new ArrayList<VehicleModel>();

    public List<VehicleModel> getVehicleModelList() {
        return vehicleModelList;
    }

    public void setVehicleModelList(List<VehicleModel> vehicleModelList) {
        this.vehicleModelList = vehicleModelList;
    }
}
