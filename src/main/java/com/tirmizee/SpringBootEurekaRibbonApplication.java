package com.tirmizee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.tirmizee.config.RibbonConfig;

@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name = "customer-service", configuration = RibbonConfig.class)
public class SpringBootEurekaRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaRibbonApplication.class, args);
	}

}
