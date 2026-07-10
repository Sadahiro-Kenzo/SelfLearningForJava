package com.example.accessing_data_mongodb;

import org.springframework.boot.SpringApplication;

public class TestAccessingDataMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.from(AccessingDataMongodbApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
