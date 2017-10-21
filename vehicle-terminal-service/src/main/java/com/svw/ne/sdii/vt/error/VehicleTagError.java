package com.svw.ne.sdii.vt.error;

import com.ne.boot.common.exception.IError;

/**
 * Created by yong.liu on 2016/12/9.
 */
public enum VehicleTagError implements IError {
    TAG_IMPROT_TYPE_NOT_EXCEL("0010", "导入文件不是.xls/.xlsx格式"),
    TAG_IMPROT_OVERSIZE("0011", "导入文件大小超过上限"),
    TAG_IMPROT_PROPERTY_REQUIRED("0012", "导入文件中必填数据不能为空"),
    TAG_IMPROT_PROPERTY_VALUE_REPETITION("0013", "导入文件数据重复"),
    TAG_IMPROT_TIMEOUT("0014", "导入文件超时");

    String errorCode;
    String errorMessage;
    private static final String ns = "VEHICLE_TAG";

    VehicleTagError(String errorCode, String errorMessage) {
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
