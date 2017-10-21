package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 * 操作历史记录类型
 */
public enum HistroyType {
    DEVICE_VEHICLE("设备与车辆"),
    SIM_DEVICE("sim与设备"),
    OWNER_VEHICLE("车主与车辆");

    HistroyType(String displayName) {
        this.displayName = displayName;
    }
    private String displayName;
    public String getDisplayName() {
        return displayName;
    }
    public String toString(){
        return this.name();
    }
}
