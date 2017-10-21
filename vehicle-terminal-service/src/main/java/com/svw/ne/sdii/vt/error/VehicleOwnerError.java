package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleOwnerError implements IError {
    OWNER_NOT_FOUND("0001", "vehicle owner not exist"),
    OWNER_IS_EXIST("0002", "vehicle owner is exist"),
    OWNER_PROPERTY_NOT_NULL("0003", "vehicle owner property can't is null"),
    OWNER_ID_NULL("0004", "vehicle owner id is null"),
    OWNER_IDNUMBER_NOT_NULL("0005", "vehicle owner idnumber can't is null");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_OWNER";

    VehicleOwnerError(String errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getNamespace() {
        return ns;
    }

    public String getErrorCode() {
        return ns + "_" + errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
