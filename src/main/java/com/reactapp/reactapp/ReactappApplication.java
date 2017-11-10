package com.reactapp.reactapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactappApplication {

	public static void main(String[] args) {
		  System.getProperties().put( "server.port", 2017 );  
		SpringApplication.run(ReactappApplication.class, args);
	}
}
