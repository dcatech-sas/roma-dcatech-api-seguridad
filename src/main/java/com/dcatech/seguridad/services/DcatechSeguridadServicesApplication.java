package com.dcatech.seguridad.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.dcatech.security.commons.models.entity"})
public class DcatechSeguridadServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DcatechSeguridadServicesApplication.class, args);
    }

}
