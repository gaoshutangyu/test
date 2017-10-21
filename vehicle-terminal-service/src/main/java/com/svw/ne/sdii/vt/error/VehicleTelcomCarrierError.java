package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleTelcomCarrierError implements IError {
    TELCOM_CARRIER_NOT_FOUND("0001", "vehicleTelcomCarrier not found"),
    TELCOM_CARRIER_EXISTS("0002", "vehicleTelcomCarrier already existing"),
    TELCOM_CARRIER_PROPERTY_NULL("0003", "vehicleTelcomCarrier property is null"),
    TELCOM_CARRIER_NAME_NULL("0004", "vehicleTelcomCarrier name is null"),
    TELCOM_CARRIER_ID_NULL("0005", "vehicleTelcomCarrier id is null");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_TELCOM_CARRIER";

    VehicleTelcomCarrierError(String errorCode, String errorMessage) {
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
