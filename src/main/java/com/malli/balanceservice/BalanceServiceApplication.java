package com.malli.balanceservice;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Balance Service", description = "This is a Spring Boot Balance Microservice"))
/*@OpenAPIDefinition(info = @Info(title = "Balance Service", description = "This is a Spring Boot Balance Microservice"),
        security = @SecurityRequirement(name = "AUTHORIZATION"))
@SecurityScheme(name = "AUTHORIZATION", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)*/
@SuppressWarnings("checkstyle:HideUtilityClassConstructor")
public class BalanceServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BalanceServiceApplication.class, args);
    }

}
