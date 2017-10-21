package com.svw.ne.sdii.vt.vo.dealer;

import com.svw.ne.sdii.vt.enumtype.DealerStatus;
import com.svw.ne.sdii.vt.vo.BaseObjct;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by andy on 2017/5/8.
 */
public class VehicleDealerServerRelation extends BaseObjct {
    @ApiModelProperty(value = "服务站编码", required = true)
    private String fCode;
    @ApiModelProperty(value = "经销商编码", required = true)
    private String sCode;
    @ApiModelProperty(value = "服务站状态",allowableValues = "1:有效,2:退网",required = true)
    private Integer fStatus;
    @ApiModelProperty(value = "经销商状态",allowableValues = "1:有效,2:退网", required = true)
    private Integer dStatus;

    @ApiModelProperty(value = "服务站状态",required = true)
    private DealerStatus fDealerStatus;
    @ApiModelProperty(value = "经销商状态", required = true)
    private DealerStatus dDealerStatus;

    public DealerStatus getfDealerStatus() {
        return fDealerStatus;
    }

    public void setfDealerStatus(DealerStatus fDealerStatus) {
        this.fDealerStatus = fDealerStatus;
    }

    public DealerStatus getdDealerStatus() {
        return dDealerStatus;
    }

    public void setdDealerStatus(DealerStatus dDealerStatus) {
        this.dDealerStatus = dDealerStatus;
    }

    public String getfCode() {
        return fCode;
    }

    public void setfCode(String fCode) {
        this.fCode = fCode;
    }

    public String getsCode() {
        return sCode;
    }

    public void setsCode(String sCode) {
        this.sCode = sCode;
    }

    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
        if (fStatus != null &&fStatus == 1){
            this.fDealerStatus = DealerStatus.ACTIVE;
        }else{
            this.fDealerStatus = DealerStatus.INACTIVE;
        }
    }

    public Integer getdStatus() {
        return dStatus;
    }

    public void setdStatus(Integer dStatus) {
        this.dStatus = dStatus;
        if (dStatus != null &&dStatus == 1){
            this.dDealerStatus = DealerStatus.ACTIVE;
        }else{
            this.dDealerStatus = DealerStatus.INACTIVE;
        }
    }
}
