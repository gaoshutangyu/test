package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by dogchen on 2017/4/10.
 */
public enum VehicleTServiceError implements IError {
    VIN_IS_illegal("001", "vin is illegal"),
    VIN_NOT_EXIST("002", "vin not exist"),
    SERVICE_ALREADY_OPENED("003", "the vin has already opened t_service"),
    SEND_SMS_FAILED("004", "sms send failed"),
    OPEN_TSERVER_FAILED("005", "open t_service failed"),
    PIN_ERROR("1001", "original pin error"),
    PWD_NOT_SAME("1002", "password not same"),
    USERNAME_ERROR("2001", "username error"),
    IDNUMBER_ERROR("2002", "original id_number error"),
    VERIF_FAILED("2003", "verif-code error"),
    VIN_AND_ENGINE_NOT_MATCH("2004", "vin and engine not match"),
    T_SERVICE_NOT_OPEN("2005", "t service not open"),
    UPDATE_FAILED("3001", "update failed"),
    DEVICE_SN_ERROR("3002", "device sn error"),
    CHANGE_FAILED("3002", "change tbox failed");
    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_T_SERVICE";

    VehicleTServiceError(String errorCode, String errorMessage) {
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
