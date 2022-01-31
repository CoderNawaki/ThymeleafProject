package com.dev.forms;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dev","com.dev.service"} )
public class FormsApplication{

	public static void main(String[] args) {
		SpringApplication.run(FormsApplication.class, args);
	} 

}
