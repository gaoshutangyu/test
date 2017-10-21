package com.svw.ne.sdii.vt.vo.sim;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * SIM卡信息
 */
public class VehicleSimPackage extends BaseObjct {

    @ApiModelProperty("SIM卡套餐id")
    private Long id;
    @ApiModelProperty("SIM卡套餐名字")
    private String name;

    @Override
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
}
