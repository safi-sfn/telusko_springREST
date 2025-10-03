package in.inxod.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import in.inxod.kafka.util.AppConstant;

@SpringBootApplication
public class KafkaSubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaSubscriberApplication.class, args);
	}
	
	@KafkaListener(topics=AppConstant.TOPIC_NAME, groupId="group_inxod_customer")
	public void subscribeMsgFromKafkaTopic(String cxData) {
		System.out.println("Message is comming from kafka server");
		System.out.println(cxData);
	}

}
