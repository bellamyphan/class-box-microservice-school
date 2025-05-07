package com.bellamyphan.microservice_school;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceSchoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSchoolApplication.class, args);
	}

}
