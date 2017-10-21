package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleColorError implements IError {
    COLOR_NOT_FOUND("0001", "vehicle color not exist"),
    COLOR_ID_NULL("0002", "color id can't be null"),
    COLOR_FOREIGN_KEY_CONSTRAINT("0003", "foreign key constraint error"),
    COLOR_PROPERTY_ERROR("0004", "color property is error"),
    COLOR_EXISTS("0005", "vehicle color is exist"),
    COLOR_CODE_NULL("0006", "color code can't be null"),
    COLOR_NAME_NULL("0007", "color name can't be null");


    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_COLOR";

    VehicleColorError(String errorCode, String errorMessage) {
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
