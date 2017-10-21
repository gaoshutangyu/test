package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 */
public enum ItemStatus {
    VALID("有效"),
    DISABLED("无效");

    ItemStatus(String displayName) {
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
