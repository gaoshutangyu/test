package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleSimError implements IError {
    SIM_NOT_FOUND("0001", "vehicle sim not exist"),
    SIM_ID_NULL("0002", "sim id can't be null"),
    SIM_CARRRIER_ID_NULL("0003", "sim carrier id can't be null"),
    SIM_FOREIGN_KEY_CONSTRAINT("0004", "foreign key constraint error"),
    SIM_EXISTS("0005", "ICCID/IMSI already existing"),
    SIM_PROPERTY_NULL("0006", "vehicle Sim parameter is null"),
    SIM_BINDING_NULL("0007", "vehicle Sim binding device parameter is null"),
    SIM_NOT_UNBIND_DEVICE("0008", "not unbind sim for device"),
    SIM_IS_BIND_OTHERDEVICE("0009", "sim is binding for other device"),
    SIM_IMPROT_TYPE_NOT_EXCEL("0010", "sim improt type not excel"),
    SIM_IMPROT_OVERSIZE("0011", "sim improt size is overproof"),
    SIM_IMPROT_PROPERTY_REQUIRED("0012", "sim improt parameter is required"),
    SIM_IMPROT_PROPERTY_VALUE_REPETITION("0013", "sim improt data is repetition"),
    SIM_IMPROT_TIMEOUT("0014", "sim file improt time out"),
    SIM_DISABLED("0015", "sim is disabled"),
    SIM_PACKAGE_IS_NOT_EXIST("0016", "sim package is not exist"),
    SIM_ICCID_NULL("0017", "sim iccid can't be null"),
    SIM_NUMBER_NULL("0018", "sim number can't be null"),
    SIM_PACKAGE_ID_NULL("0019", "sim package id is not null"),
    SIM_NOT_BOUND_DEVICE("0020", "SIM卡未绑定设备");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_SIM";

    VehicleSimError(String errorCode, String errorMessage) {
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
