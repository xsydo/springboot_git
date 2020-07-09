package com.xsy.xsy_pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan(basePackages = {"com.xsy.xsy_pms.dao"}) //扫描DAO
@ServletComponentScan("com.xsy.hr.filters")
public class XsyPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(XsyPmsApplication.class, args);
    }

}
