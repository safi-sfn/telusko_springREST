package in.inxod.kafka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import in.inxod.kafka.model.Customer;
import in.inxod.kafka.util.AppConstant;

@Service
public class KafkaService {

	@Autowired
	private KafkaTemplate<String, Customer> kafkaTemplate;
	
	public String addCxMsg(Customer cx) {
		kafkaTemplate.send(AppConstant.TOPIC_NAME, cx);
		return "Customer Data added in kafka Server";
	}
}
