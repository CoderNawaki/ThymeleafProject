package com.chart.chart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"com.chart"})
public class ChartApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ChartApplication.class, args);
	}

}
