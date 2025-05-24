package com.slackapp.slackApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SlackAppApplication {

	public static void main(String[] args) {
		System.out.println("Main App");
		SpringApplication.run(SlackAppApplication.class, args);
		System.out.println("App");
		System.out.println("");
	}

}
