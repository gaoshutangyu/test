package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by andy on 2017/5/26.
 * 车主与车辆的销售关系类型
 */
public enum SaleRelationType {
    OWNED("当前拥有关系"),
    OLD_OWN("历史拥有关系");

    SaleRelationType(String displayName) {
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
