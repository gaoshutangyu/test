package com.svw.ne.sdii.vt.vo.series;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/14.
 */
public class CollectVehicleSeries {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "车系名称", required = true)
    private String name;
    @ApiModelProperty(value = "车系别名")
    private String nameAlias;
    @ApiModelProperty(value = "代码", required = true)
    private String code;
    @ApiModelProperty(value = "品牌ID", required = true)
    private Long brandId;
    @ApiModelProperty(value = "图片路径")
    private String imageUrl;
    @ApiModelProperty(value = "车系类型ID", required = true)
    private Long seriesTypeId;
    @ApiModelProperty(value = "说明")
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

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Long getSeriesTypeId() {
        return seriesTypeId;
    }

    public void setSeriesTypeId(Long seriesTypeId) {
        this.seriesTypeId = seriesTypeId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
