package com.Telebeler2.Telebeler2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class Telebeler2Application {

	public static void main(String[] args) {
		SpringApplication.run(Telebeler2Application.class, args);
	}

}
