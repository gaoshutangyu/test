package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by dogchen on 2017/4/10.
 */
public enum  PackageStatus {
    using("正在使用"),expired("已过期"), failed("开通失败"), closed("已关闭");
    private String displayName;

    PackageStatus(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
    public String toString(){
        return this.name();
    }
}
