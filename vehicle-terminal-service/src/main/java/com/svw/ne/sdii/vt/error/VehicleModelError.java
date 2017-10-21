package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleModelError implements IError {
    MODEL_NOT_FOUND("0001", "vehicle model not exist"),
    MODEL_ID_NULL("0002", "model id can't be null"),
    MODEL_FOREIGN_KEY_CONSTRAINT("0003", "foreign key constraint error"),
    MODEL_EXISTS("0004", "vehicle model is exists"),
    MODEL_PROPERTY_ERROR("0005", "vehicle model property is error"),
    MODEL_TYPE_IS_NOT_EXIST("0006", "model type is not exist"),
    MODEL_CODE_BLANK("0007", "model code can't be blank"),
    MODEL_TYPE_NAME_BLANK("0008", "model_type name can't be blank"),
    MODEL_NAME_BLANK("0009", "model name can't be blank"),
    MODEL_TYPE_IS_EXIST("0010", "model type is  exist"),
    MODEL_TYPE_CODE_BLANK("0011", "model_type code can't be blank");


    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_MODEL";

    VehicleModelError(String errorCode, String errorMessage) {
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
