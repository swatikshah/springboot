package com.springboot.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.springboot.stock.dbservice.repository")
@SpringBootApplication
public class SpringCloudDbServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDbServiceApplication.class, args);
	}
}
