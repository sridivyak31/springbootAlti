package com.example.SpringJPADemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.demo.model")
@ComponentScan("com.demo")
@EnableJpaRepositories("com.demo.repository")
public class MyRestApiDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestApiDemoApplication.class, args);
	}

}
