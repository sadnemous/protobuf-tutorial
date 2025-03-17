package com.example.users.generated.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.security.SecurityScheme;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.example.users.generated.configuration.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Title from annotation")
                                .description("Description from annotation")
                                .contact(
                                        new Contact()
                                                .name("Contact Name")
                                                .url("https://github.com/google/gnostic")
                                                .email("gnostic@google.com")
                                )
                                .license(
                                        new License()
                                                .name("Apache License")
                                                .url("https://github.com/google/gnostic/blob/master/LICENSE")
                                )
                                .version("Version from annotation")
                )
                .components(
                        new Components()
                                .addSecuritySchemes("BasicAuth", new SecurityScheme()
                                        .type(SecurityScheme.Type.HTTP)
                                        .scheme("basic")
                                )
                )
        ;
    }
}