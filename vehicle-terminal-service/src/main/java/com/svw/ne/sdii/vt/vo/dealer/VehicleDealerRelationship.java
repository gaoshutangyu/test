package com.svw.ne.sdii.vt.vo.dealer;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 经销商与经销商关联关系
 */
public class VehicleDealerRelationship {
    @ApiModelProperty("父经销商ID")
    private Long parentId;
    @ApiModelProperty("子经销商ID")
    private Long childId;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getChildId() {
        return childId;
    }

    public void setChildId(Long childId) {
        this.childId = childId;
    }
}
