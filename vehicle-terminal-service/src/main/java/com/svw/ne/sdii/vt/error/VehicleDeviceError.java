package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleDeviceError implements IError {
    DEVICE_NOT_FOUND("0001", "vehicle device not exist"),
    DEVICE_ID_NULL("0002", "device id can't be null"),
    DEVICE_MODEL_ID_NULL("0003", "device model id can't be null"),
    DEVICE_FOREIGN_KEY_CONSTRAINT("0004", "foreign key constraint error"),
    DEVICE_NOT_UNBIND("0005", "device not unbind"),
    DEVICE_NOT_BIND("0006", "device not bind"),
    DEVICE_IMPROT_TYPE_NOT_EXCEL("0007", "device improt type not excel"),
    DEVICE_IMPROT_OVERSIZE("0008", "device improt size is overproof"),
    DEVICE_IMPROT_PROPERTY_REQUIRED("0009", "device improt parameter is required"),
    DEVICE_IMPROT_PROPERTY_VALUE_REPETITION("0010", "device improt data is repetition"),
    DEVICE_IMPROT_TIMEOUT("0011", "device file improt time out"),
    DEVICE_EXISTS("0012", "vehicle device is existing"),
    DEVICE_DISABLED("0013", "vehicle device is disabled"),
    DEVICE_INSTALLED("0014", "vehicle device is installed"),
    DEVICE_PROPERTY_ERROR("0015", "device property is error"),
    DEVICE_SN_NULL("0016", "device sn can't be null"),

    DEVICE_NOTBIND_VEHICLE("1001", "设备未绑定车辆"),
    DEVICE_NOTBIND_SIM("1002", "设备未绑定SIM卡"),
    DEVICE_BINDED_VEHICLE("1003", "设备已绑定过车辆");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_DEVICE";

    VehicleDeviceError(String errorCode, String errorMessage) {
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
