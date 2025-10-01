package in.inxod.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.kafka.service.KafkaService;

@RestController
public class CustomerController {
	
	@Autowired
	private KafkaService service;

}
