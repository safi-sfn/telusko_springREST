package in.inxod.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.kafka.model.Customer;
import in.inxod.kafka.service.KafkaService;

@RestController
public class CustomerController {
	
	@Autowired
	private KafkaService service;
	
	@PostMapping("/add-cx")
	public String addCustomer(@RequestBody Customer cx) {
		return service.addCxMsg(cx);
	}

}
