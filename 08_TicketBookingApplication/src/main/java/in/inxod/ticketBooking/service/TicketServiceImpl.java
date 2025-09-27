package in.inxod.ticketBooking.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	private String postUrl = "http://localhost:8484/inxod/get-ticketNumber";
	private String getUrl = "http://localhost:8484/inxod/get-ticket/{ticketNumber}";
	
	@Override
	public int registerPassenger(Passenger passenger) {
		// RestTemplate  or // WebClient
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Integer> response = restTemplate.postForEntity(postUrl, passenger, Integer.class);
		int ticketNumber = response.getBody();
		return ticketNumber;
	}

	@Override
	public Ticket generateTicket(int ticketNumber) {
		
		// RestTemplate  or // WebClient
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Ticket> response = restTemplate.getForEntity(getUrl, Ticket.class, ticketNumber);
		Ticket ticket = response.getBody();
		
		return ticket;
	}

}
