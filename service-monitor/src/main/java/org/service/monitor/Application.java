/*******************************************************************************
 * SpringFeatures
 * Copyright (C) 2018 Lars Helmuth Probst - All Rights Reserved.
 *
 * @author Lars Helmuth Probst (Alienuser)
 * @copyright 2018 Lars Helmuth Probst
 * @link https://www.Lars-Probst.de
 ******************************************************************************/

package org.service.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
