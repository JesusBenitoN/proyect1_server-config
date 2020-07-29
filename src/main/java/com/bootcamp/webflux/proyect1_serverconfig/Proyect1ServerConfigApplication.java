package com.bootcamp.webflux.proyect1_serverconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class Proyect1ServerConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(Proyect1ServerConfigApplication.class, args);
	}

}
