package com.svw.ne.sdii.vt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by yutan on 2017/10/21.
 */
@SpringBootApplication
@MapperScan(basePackageClasses = VehicleTerminalApplication.class)
@EnableSwagger2
@EnableTransactionManagement
public class VehicleTerminalApplication {
    public static void main(String[] args)  {
        SpringApplication.run(VehicleTerminalApplication.class, args);
        // TODO: 2017/10/21

    }
}
