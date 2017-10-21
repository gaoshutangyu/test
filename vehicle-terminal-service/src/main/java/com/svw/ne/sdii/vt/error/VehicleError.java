package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleError implements IError {
    VEHICLE_NOT_FOUND("0001", "vehicle not exist"),
    VEHICLE_IS_ONSALE("0002", "vehicle is already on sale."),
    VEHICLE_IS_EXIST("0003", "vehicle is exist"),
    VEHICLE_NOT_UNBIND("0004", "vehicle not unbind by vehicle owner"),
    VEHICLE_IS_BIND("0005", "vehicle is bind by other vehicle owner"),
    VEHICLE_PROPERTY_NULL("0006", "vehicle property can't be null"),
    VEHICLE_VIN_NULL("0007", "vehicle vin can't be null"),
    VEHICLE_NOT_WRITEOFF("0008", "vehicle can't writeOff"),
    VEHICLE_WRITEOFF("0009", "vehicle is writeOff"),
    VEHICLE_ID_NULL("0010", "vehicle id can't be null");


    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE";

    VehicleError(String errorCode, String errorMessage) {
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
