package in.inxod.ticketBooking.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	private String postUrl = "http://localhost:8484/inxod/get-ticketNumber";
	private String getUrl = "http://localhost:8484/inxod/get-ticket/{ticketNumber}";
	
	@Override
	public int registerPassenger(Passenger passenger) {
		// RestTemplate  or // WebClient
		
		// RestTemplate --> it is a class  --> Synchronous in nature
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Integer> response = restTemplate.postForEntity(postUrl, passenger, Integer.class);
//		int ticketNumber = response.getBody();
		
		// WebClient  --> it is an Interface --> Synchronous and Asynchronous in nature
		WebClient webClient = WebClient.create();
		Integer ticketNumber = webClient.post()
		.uri(postUrl)
		.bodyValue(passenger)
		.retrieve()
		.bodyToMono(Integer.class)
		.block();
		return ticketNumber;
	}

	@Override
	public Ticket generateTicket(int ticketNumber) {
		
		// RestTemplate  or // WebClient
		
		// RestTemplate
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Ticket> response = restTemplate.getForEntity(getUrl, Ticket.class, ticketNumber);
//		Ticket ticket = response.getBody();
		
		
		// WebClient
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.get()
		.uri(getUrl, ticketNumber)
		.retrieve()
		.bodyToMono(Ticket.class)
		.block();
		
		return ticket;
	}

}
