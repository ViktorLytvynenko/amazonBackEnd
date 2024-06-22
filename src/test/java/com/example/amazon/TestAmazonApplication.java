package com.example.amazon;

import org.springframework.boot.SpringApplication;

public class TestAmazonApplication {

	public static void main(String[] args) {
		SpringApplication.from(AmazonApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
