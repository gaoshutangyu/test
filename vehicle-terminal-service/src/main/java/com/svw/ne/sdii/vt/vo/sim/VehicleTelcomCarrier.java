package com.svw.ne.sdii.vt.vo.sim;

import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/7.
 * 通信运营商
 */
public class VehicleTelcomCarrier extends BaseObjct {

    @ApiModelProperty(value = "名称", required = true)
    private String name;
    @ApiModelProperty("别名")
    private String nameAlias;
    @ApiModelProperty("国家代码")
    private String countryCode;

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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
