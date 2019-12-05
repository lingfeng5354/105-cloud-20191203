package com.aaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author:祁继港
 * @Date:2019/12/3 8:44
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaTwoServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaTwoServerApplication.class,args);
    }
}
