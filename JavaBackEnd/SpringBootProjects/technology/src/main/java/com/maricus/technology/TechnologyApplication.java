package com.maricus.technology;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TechnologyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnologyApplication.class, args);
	}

}
