package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleDeviceModelError implements IError {
    MANUFACTURER_HAS_DEVICE("0001", "device model manufacturer has device"),
    MANUFACTURER_NOT_FOUND("0002", "device model manufacturer not found"),
    MANUFACTURER_EXISTS("0003", "device model manufacturer is exists"),
    MANUFACTURER_ID_NULL("0004", "device model manufacturer id is null"),
    MANUFACTURER_PROPERTY_ERROR("0005", "device model manufacturer property is error"),
    MANUFACTURER_NAME_BLANK("0006", "device model manufacturer name is blank"),
    DEVICEMODEL_NOT_FOUND("0007", "device model not found"),
    DEVICEMODEL_ID_NULL("0008", "device model id can't null"),
    DEVICEMODEL_NAME_BLANK("0009", "device model name is blank"),
    DEVICEMODEL_EXISTS("0010", "device model is exists"),
    DEVICEMODEL_PROPERTY_ERROR("0011", "device model property is error"),
    DEVICEMODEL_FOREIGN_KEY_CONSTRAINT("0012", "foreign key constraint error");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_DEVICE_MODEL";

    VehicleDeviceModelError(String errorCode, String errorMessage) {
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
