package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleDealerError implements IError {
    DEALER_NOT_FOUND("0001", "vehicle dealer not exist"),
    DEALER_ID_NULL("0002", "dealer id can't be null"),
    DEALER_NAME_NULL("0003", "dealer name can't be null"),
    DEALER_FOREIGN_KEY_CONSTRAINT("0004", "foreign key constraint error"),
    DEALER_IS_EXIST("0005", "dealer is exist"),
    DEALER_NOT_ADDVEHICLE("0006","dealer can't add vehicle"),
    DEALER_PROPERTY_ERROR("0007", "dealer property is error"),
    DEALER_CODE_NULL("0008", "dealer code can't be null"),
    DEALER_PARENTID_NULL("0009", "dealer parentId can't be null");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_DEALER";

    VehicleDealerError(String errorCode, String errorMessage) {
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
