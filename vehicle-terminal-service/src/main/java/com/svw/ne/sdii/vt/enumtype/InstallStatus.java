package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 * 设备与车辆、SIM卡与设备的安装状态
 */
public enum InstallStatus {
    VALID("已安装"),
    UNINSTALLED("未安装"),
    DISABLED("作废");

    InstallStatus(String displayName) {
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
