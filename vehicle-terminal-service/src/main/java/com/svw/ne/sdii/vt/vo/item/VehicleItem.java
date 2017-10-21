package com.svw.ne.sdii.vt.vo.item;

import com.svw.ne.sdii.vt.enumtype.ItemStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by andy on 2017/6/13.
 */
public class VehicleItem extends BaseObjct {
    @ApiModelProperty("名称")
    private String name;
    @ApiModelProperty("父级id")
    private Long parentId;
    @ApiModelProperty("编码")
    private String code;
    @ApiModelProperty("服务值")
    private String value;
    @ApiModelProperty("状态")
    private ItemStatus status;

    @ApiModelProperty("子级item")
    private List<VehicleItem> items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

    public List<VehicleItem> getItems() {
        return items;
    }

    public void setItems(List<VehicleItem> items) {
        this.items = items;
    }
}
