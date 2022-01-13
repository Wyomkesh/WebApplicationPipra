package com.app.petstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
public class WebApplicationPipraApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplicationPipraApplication.class, args);
		System.out.println("Started");
	}

}
