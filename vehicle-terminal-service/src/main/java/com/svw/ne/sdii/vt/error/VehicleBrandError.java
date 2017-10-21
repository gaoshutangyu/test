package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleBrandError implements IError {
    BRAND_NOT_FOUND("0001", "vehicle brand not exist"),
    BRAND_ID_NULL("0002", "brand id can't be null"),
    BRAND_FOREIGN_KEY_CONSTRAINT("0003", "foreign key constraint error"),
    BRAND_IS_EXISTS("0004", "brand is exists"),
    BRAND_PROPERTY_ERROR("0005", "brand property is error"),
    BRAND_CODE_NULL("0006", "brand code can't be null"),
    BRAND_NAME_NULL("00067", "brand name can't be null");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_BRAND";

    VehicleBrandError(String errorCode, String errorMessage) {
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
