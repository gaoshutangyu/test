package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 * 操作类型
 */
public enum OperateType {
    BIND("绑定"),
    UNBIND("解绑"),
    CHANGE("更换"),
    WRITEOFF("作废");

    OperateType(String displayName) {
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
