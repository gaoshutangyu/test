package com.svw.ne.sdii.vt.enumtype;

/**
 * Created by andy on 2017/5/26.
 * 证件类型
 */
public enum CertificateType {
    ID_CARD("身份证");

    CertificateType(String displayName) {
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
