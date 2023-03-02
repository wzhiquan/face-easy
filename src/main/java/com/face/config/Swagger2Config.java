package com.face.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2Config {


    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo()).securitySchemes(Lists.newArrayList(apiKey())).enable(true)
                .genericModelSubstitutes(ResponseEntity.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.face"))
                .paths(PathSelectors.any())
                .build();
    }

    /**
     * token
     */
    private ApiKey apiKey() {
        return new ApiKey("token", "authorization", "header");
    }

    /**
     * api描述
     *
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("xxx系统")
                .description("xxxx系统后端api")
                .termsOfServiceUrl("https://www.baidu.com/")
                .version("1.0")
                .build();
    }
}