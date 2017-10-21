package com.svw.ne.sdii.vt.vo.tag;

import com.svw.ne.sdii.vt.enumtype.TagStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/6/8.
 */
public class VehicleTag extends BaseObjct {
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("备注")
    private String code;
    @ApiModelProperty("状态")
    private TagStatus status;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty("与车辆关联id")
    private Long tagRelId;

    public Long getTagRelId() {
        return tagRelId;
    }

    public void setTagRelId(Long tagRelId) {
        this.tagRelId = tagRelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TagStatus getStatus() {
        return status;
    }

    public void setStatus(TagStatus status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
