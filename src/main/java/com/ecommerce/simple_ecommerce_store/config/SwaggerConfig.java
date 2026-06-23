package com.ecommerce.simple_ecommerce_store.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.security.SecurityScheme;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Simple Ecommerce Store API")
                        .description("A comprehensive REST API for managing products and user authentication in an ecommerce platform. " +
                                "This API provides endpoints for user registration, login, and complete product management (CRUD operations).")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Roshan Chitrang")
                                .email("roshanchitrang9307@gmail.com")
                                .url("https://github.com/roshanchitrang9307-gif"))
                        .license(new License()
                                .name("MIT License")
                                .url("https://opensource.org/licenses/MIT")))
                .addSecurityItem(new SecurityRequirement().addList("Bearer"))
                .components(new io.swagger.v3.oas.models.Components()
                        .addSecuritySchemes("Bearer",
                                new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("bearer")
                                        .bearerFormat("JWT")
                                        .description("JWT token for authentication. " +
                                                "Example: Bearer eyJhbGciOiJIUzI1NiJ9...")));
    }
}
