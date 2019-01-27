package com.ibrahim.springbootkafka.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.ibrahim.springbootkafka.model.User;

@Component
public class IndexController {
	
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplateJson;
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplateString;
	
	private static final String TOPIC = "manorek";
	
	public void kafkaTest() {
		System.out.println("Start");
//		User user = new User();
//		user.setName("ibrahim");
//		user.setDept("Technology");
//		user.setSalary(10000L);
//		kafkaTemplate.send(TOPIC, user);
		
		
		kafkaTemplateString.send(TOPIC, "mantul gan");
		log.info("finish");
	}

}
