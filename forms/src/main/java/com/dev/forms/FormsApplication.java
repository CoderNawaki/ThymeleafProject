package com.dev.forms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.*")
@EntityScan("con.dev.domain")
public class FormsApplication{

	public static void main(String[] args) {
		SpringApplication.run(FormsApplication.class, args);
	} 

}
