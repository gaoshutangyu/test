package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by andy on 2017/5/26.
 * 联系信息类型
 */
public enum ContactType {
    EMERGENCY_CONTACT("紧急联系人"),
    SALES("销售联系人"),
    AFTER_SALES("售后联系人"),
    RESCUE("救援联系人");

    ContactType(String displayName) {
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
