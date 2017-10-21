package com.svw.ne.sdii.vt.service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yutan on 2017/10/21.
 */
@RestController
@Validated
@Api("车辆品牌服务")
public class TestService {
    @ApiOperation("分页查询品牌列表")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "pageIndex", value = "查询页码", paramType = "query"),
            @ApiImplicitParam(name = "pageSize", value = "查询返回数据条数", paramType = "query")})
    @RequestMapping("/test")
    public String test() {

        // TODO: 2017/10/21  
        
        return "test";
    }


}
