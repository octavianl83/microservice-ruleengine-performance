package com.logicore.rest.services.serviceprocessor1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@EnableFeignClients
@SpringBootApplication
public class ServiceProcessor1Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceProcessor1Application.class, args);
	}

}
