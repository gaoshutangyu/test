package com.svw.ne.sdii.vt.vo.color;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/9.
 */
public class CollectVehicleColor {
    @ApiModelProperty(value = "id")
    private Long id;
    @ApiModelProperty(value = "颜色名", required = true)
    private String name;
    @ApiModelProperty(value = "颜色别名")
    private String nameAlias;
    @ApiModelProperty(value = "颜色代码", required = true)
    private String code;
    @ApiModelProperty(value = "颜色代码")
    private String code2;
    @ApiModelProperty(value = "描述")
    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

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

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }
}
