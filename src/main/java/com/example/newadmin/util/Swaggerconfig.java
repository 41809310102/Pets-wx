package com.example.newadmin.util;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration //配置类
@EnableSwagger2// 开启Swagger2的自动配置
public  class Swaggerconfig {

    @Bean
    public Docket docket() {
        // 设置要显示swagger的环境
        // 通过 enable() 接收此参数判断是否要显示
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true) //配置是否启用Swagger，如果是false，在浏览器将无法访问
                .select()// 通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.example.newadmin.controller"))
                //配置你想在那个controller层生产接口文档
                .paths(PathSelectors.ant("/api/**"))
                // 配置如何通过path过滤,即这里只扫描请求以/kuang开头的接口
                .build();
    }

    //配置文档信息
    private ApiInfo apiInfo() {
        Contact contact = new Contact("宠物医院预约小程序后端接口配置", "", "");
        return new ApiInfo(
                "宠物医院预约小程序", // 标题
                "宠物医院预约小程序后端接口配置", // 描述
                "v1.0", // 版本
                "", // 组织链接
                contact, // 联系人信息
                "Apach 2.0 许可", // 许可
                "许可链接", // 许可连接
                new ArrayList<>()// 扩展
        );
    }

}

