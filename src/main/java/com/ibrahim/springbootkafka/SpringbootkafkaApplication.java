package com.ibrahim.springbootkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ibrahim.springbootkafka.controller.IndexController;

@SpringBootApplication
public class SpringbootkafkaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootkafkaApplication.class, args);
	}
	
	@Autowired
	private IndexController indexController;

	@Override
	public void run(String... args) throws Exception {
		indexController.kafkaTest();
	}

}

