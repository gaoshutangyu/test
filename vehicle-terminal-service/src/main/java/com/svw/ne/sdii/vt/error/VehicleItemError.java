package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleItemError implements IError {
    ITEM_NOT_FOUND("0001", "远程控制命令不存在"),
    ITEM_IS_DISABLED("0002", "远程控制命令已无效"),
    ITEM_CODE_NOT_NULL("0003", "远程控制命令编码不能为空");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_ITEM";

    VehicleItemError(String errorCode, String errorMessage) {
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
