package com.example.lab3server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Lab3ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ServerApplication.class, args);
	}

}
