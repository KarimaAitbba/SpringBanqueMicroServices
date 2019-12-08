package org.sid.service_compte;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceCompteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceCompteApplication.class, args);
	}

}
