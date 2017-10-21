package com.svw.ne.sdii.vt.vo.common;

/**
 * Created by andy on 2017/4/19.
 */
public class ImprotErrorVO {
    //导入数据行数
    private Integer rowNumber;
    //数据标识
    private String content;
    //错误消息
    private String message;

    public ImprotErrorVO() {
    }

    public ImprotErrorVO(Integer rowNumber, String content, String message) {
        this.rowNumber = rowNumber;
        this.content = content;
        this.message = message;
    }

    public Integer getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(Integer rowNumber) {
        this.rowNumber = rowNumber;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
