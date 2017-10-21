package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by andy on 2017/5/26.
 * 性别
 */
public enum GenderType {
    M("男性"),
    F("女性");

    GenderType(String displayName) {
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
