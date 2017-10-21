package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 */
public enum SimStatus {
    ACTIVE("已激活"),
    INACTIVE("未激活"),
    UNAVAILABLE("不可用"),
    DISABLED("已作废");

    SimStatus(String displayName) {
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
