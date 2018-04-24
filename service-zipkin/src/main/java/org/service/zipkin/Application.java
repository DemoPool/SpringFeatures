/*******************************************************************************
 * SpringFeatures
 * Copyright (C) 2018 Lars Helmuth Probst - All Rights Reserved.
 *
 * @author Lars Helmuth Probst (Alienuser)
 * @copyright 2018 Lars Helmuth Probst
 * @link https://www.Lars-Probst.de
 ******************************************************************************/

package org.service.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableDiscoveryClient
@SpringBootApplication
@EnableZipkinServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
