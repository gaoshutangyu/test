package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleSeriesError implements IError {
    SERIES_NOT_FOUND("0001", "vehicle series not exist"),
    SERIES_ID_NULL("0002", "series id can't be null"),
    SERIES_FOREIGN_KEY_CONSTRAINT("0003", "foreign key constraint error"),
    SERIES_PROPERTY_ERROR("0004", "series property is error"),
    SERIES_EXIST("0005", "vehicle series is exist"),
    SERIES_CODE_NULL("0006", "series code can't be null"),
    SERIES_NAME_NULL("0007", "series name can't be null"),
    SERIES_TYPE_NAME_NULL("0008", "seriesType name can't be null"),
    SERIES_TYPE_ID_NULL("0009", "seriesType id can't be null"),
    SERIES_TYPE_NOT_FOUND("0010", "vehicle seriesType not exist"),
    SERIES_TYPE_IS_EXIST("0011", "vehicle seriesType is exist"),
    SERIES_TYPE_CODE_NULL("0012", "seriesType code can't be null");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_SERIES";

    VehicleSeriesError(String errorCode, String errorMessage) {
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
