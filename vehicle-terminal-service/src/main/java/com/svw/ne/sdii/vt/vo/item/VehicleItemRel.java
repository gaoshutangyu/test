package com.svw.ne.sdii.vt.vo.item;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/6/13.
 */
public class VehicleItemRel extends BaseObjct {
    @ApiModelProperty("品牌id")
    private Long modelId;
    @ApiModelProperty("远程命令id")
    private Long itemId;

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
}
