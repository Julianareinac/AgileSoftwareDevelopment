package com.uniquindio.AgileSoftwareDevelopment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SouthCoastNauticalSuppliesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SouthCoastNauticalSuppliesApplication.class, args);
	}

}
