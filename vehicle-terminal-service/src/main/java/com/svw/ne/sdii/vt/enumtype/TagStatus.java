package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by yang.yang on 2017/5/26.
 * 车辆标识状态
 */
public enum TagStatus {
    VALID("有效"),
    WRITTENOFF("作废");

    TagStatus(String displayName) {
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
