package com.svw.ne.sdii.vt.vo.device;

import com.svw.ne.sdii.vt.enumtype.DeviceStatus;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by yong.liu on 2016/12/19.
 */
public class CollectVehicleDevice {
    @ApiModelProperty("id")
    private Long id;
    @ApiModelProperty(value = "序列号", required = true)
    private String sn;
    @ApiModelProperty("国际移动设备识别号")
    private String imei;
    @ApiModelProperty("备注")
    private String remark;
    @ApiModelProperty(value = "设备的状态",allowableValues = "VALID已安装/UNINSTALLED未安装/DISABLE已作废")
    private DeviceStatus status;
    @ApiModelProperty("设备类型ID")
    private Long modelId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getImei() {
        return imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public DeviceStatus getStatus() {
        return status;
    }

    public void setStatus(DeviceStatus status) {
        this.status = status;
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }
}
