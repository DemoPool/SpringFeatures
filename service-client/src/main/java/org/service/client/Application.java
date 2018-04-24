/*******************************************************************************
 * SpringFeatures
 * Copyright (C) 2018 Lars Helmuth Probst - All Rights Reserved.
 *
 * @author Lars Helmuth Probst (Alienuser)
 * @copyright 2018 Lars Helmuth Probst
 * @link https://www.Lars-Probst.de
 ******************************************************************************/

package org.service.client;

import io.swagger.annotations.Api;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.sleuth.Sampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableDiscoveryClient
@EnableWebMvc
@SpringBootApplication
@Api(value = "service-client", description = "All operations for the service-client.")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    Sampler sampler() {
        return span -> true;
    }

}