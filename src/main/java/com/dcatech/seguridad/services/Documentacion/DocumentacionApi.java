package com.dcatech.seguridad.services.Documentacion;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;


@Configuration
@EnableSwagger2WebMvc
public class DocumentacionApi {
    @Bean
    public Docket api() {
        final Docket build = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(queryApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.dcatech.seguridad.services"))
                .paths(PathSelectors.any())
                .build()
                .tags(new Tag("Seguridad", "Administra y controla los esquemas de seguridad de la aplicación como la creación de usuarios y administración de los menús."));
        return build;
    }

    public ApiInfo queryApiInfo() {
        return new ApiInfoBuilder()
                .title("Nominal")
                .description("Nominal es la aplicación para la gestión de nomina en las compañias incritas")
                .version("1.0.0")
                .license("Nominal License Version 1.0")
                .licenseUrl("http://www.dcatech.com")
                .contact(new Contact("DCA Technology", "http://www.dcatech.com", "info@dcatech.com"))
                .build();
    }

}
