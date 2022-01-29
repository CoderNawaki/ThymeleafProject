package com.chart.chart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChartApplication.class, args);
	}

	public String hello(){
		return "hello";
	}

	public String commit(){
		return "commiting the value";
	}

	public void display(){
		System.out.println("we are displaying methods");
	}
	public static void display(int a ,int b){
		System.out.println("we are displaying methods");
	}

}
