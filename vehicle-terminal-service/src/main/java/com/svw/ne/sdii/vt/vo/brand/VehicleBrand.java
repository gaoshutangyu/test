package com.svw.ne.sdii.vt.vo.brand;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 车辆品牌
 */
public class VehicleBrand {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "名称", required = true)
    private String name;
    @ApiModelProperty(value = "别名")
    private String nameAlias;
    @ApiModelProperty(value = "代码")
    private String code;
    @ApiModelProperty(value = "图片路径")
    private String imageUrl;
    @ApiModelProperty(value = "描述")
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAlias() {
        return nameAlias;
    }

    public void setNameAlias(String nameAlias) {
        this.nameAlias = nameAlias;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
