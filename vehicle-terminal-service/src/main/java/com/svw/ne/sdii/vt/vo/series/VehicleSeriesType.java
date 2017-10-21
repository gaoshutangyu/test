package com.svw.ne.sdii.vt.vo.series;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 车系类型
 */
public class VehicleSeriesType {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "名称", required = true)
    private String name;
    @ApiModelProperty(value = "代码", required = true)
    private String code;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
