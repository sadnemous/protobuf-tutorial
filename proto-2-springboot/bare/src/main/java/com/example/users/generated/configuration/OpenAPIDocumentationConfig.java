package com.example.users.generated.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.util.UriComponentsBuilder;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.Paths;
import springfox.documentation.spring.web.paths.RelativePathProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.ServletContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-03-19T11:36:49.379298638-05:00[America/Chicago]")
@Configuration
@EnableSwagger2
public class OpenAPIDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Title from annotation")
            .description("Description from annotation")
            .license("Apache License")
            .licenseUrl("https://github.com/google/gnostic/blob/master/LICENSE")
            .termsOfServiceUrl("https://github.com/google/gnostic")
            .version("Version from annotation")
            .contact(new Contact("","", "gnostic@google.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(ServletContext servletContext, @Value("${openapi.titleFromAnnotation.base-path:}") String basePath) {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("com.example.users.generated.controller"))
                    .build()
                .pathProvider(new BasePathAwareRelativePathProvider(servletContext, basePath))
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class)
                .apiInfo(apiInfo());
    }

    class BasePathAwareRelativePathProvider extends RelativePathProvider {
        private String basePath;

        public BasePathAwareRelativePathProvider(ServletContext servletContext, String basePath) {
            super(servletContext);
            this.basePath = basePath;
        }

        @Override
        protected String applicationPath() {
            return  Paths.removeAdjacentForwardSlashes(UriComponentsBuilder.fromPath(super.applicationPath()).path(basePath).build().toString());
        }

        @Override
        public String getOperationPath(String operationPath) {
            UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder.fromPath("/");
            return Paths.removeAdjacentForwardSlashes(
                    uriComponentsBuilder.path(operationPath.replaceFirst("^" + basePath, "")).build().toString());
        }
    }

}
