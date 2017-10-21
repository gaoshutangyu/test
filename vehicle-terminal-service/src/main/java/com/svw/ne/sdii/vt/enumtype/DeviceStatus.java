package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 * 设备状态
 */
public enum DeviceStatus {
    VALID("已安装"),
    UNINSTALLED("未安装"),
    DISABLED("已作废");

    DeviceStatus(String displayName) {
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
