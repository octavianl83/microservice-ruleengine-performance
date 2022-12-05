package com.logicore.rest.services.serviceprocessormonolit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ServiceProcessorMonolitApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProcessorMonolitApplication.class, args);
	}

}
