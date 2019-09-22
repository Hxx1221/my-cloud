package com.eureka.clien.eurekaclientarticleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClientArticleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientArticleServiceApplication.class, args);
	}

}
