package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by yang.yang on 2017/5/26.
 * 车辆类型
 */
public enum VehicleStatus {
    VALID("有效"),
    RESALE("已转卖"),
    WRITTENOFF("已报废");

    VehicleStatus(String displayName) {
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
