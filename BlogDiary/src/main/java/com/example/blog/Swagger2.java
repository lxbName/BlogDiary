package com.example.blog;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
//这两个注解，一个是swagger2的配置，一个是项目启动的时候启动swagger2
public class Swagger2 {
    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                 // 是否开启
                .select()
                 // 扫描的路径包
                .apis(RequestHandlerSelectors.basePackage("com.example.blog.controller"))
                 // 指定路径处理PathSelectors.any()代表所有的路径
                .paths(PathSelectors.any())
                .build();
    }

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("blogDiary后台系统 api接口说明")
                .description("blogDiary 系统的api接口说明")
                .termsOfServiceUrl("")
                 // 作者信息
                .contact(new Contact("lxb","","645785034@qq.com")).version("1.0").build();
    }
}
