package com.formacionbdi.springboot.app.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringbootServicioGatewayServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServicioGatewayServerApplication.class, args);
	}

}
