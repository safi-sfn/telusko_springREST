package in.inxod.ticketBooking.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	// Define the API endpoints for the external ticket service
	private String postUrl = "http://localhost:8484/inxod/get-ticketNumber";
	private String getUrl = "http://localhost:8484/inxod/get-ticket/{ticketNumber}";

	// This method registers a passenger with an external ticket service and returns
	// a ticket number
	@Override
	public int registerPassenger(Passenger passenger) {

		// Two options for making HTTP requests: RestTemplate or WebClient

		// Option 1: RestTemplate --> it is a class --> Synchronous in nature
		// RestTemplate is a synchronous HTTP client (waits for response before
		// continuing)
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Integer> response = restTemplate.postForEntity(postUrl, passenger, Integer.class);
//		int ticketNumber = response.getBody();

		// Option 2: WebClient --> it is an Interface --> Synchronous and Asynchronous
		// in nature
		// WebClient is a modern HTTP client that supports both synchronous and
		// asynchronous calls
		WebClient webClient = WebClient.create();
		Integer ticketNumber = webClient.post() // Create a POST request
				.uri(postUrl) 					// Set the URL
				.bodyValue(passenger) 			// Set the request body (passenger data)
				.retrieve() 					// Execute the request
				.bodyToMono(Integer.class) 		// Convert response to Integer
				.block();						// Wait for response (makes it synchronous)

		return ticketNumber;
	}

	@Override
	public Ticket generateTicket(int ticketNumber) {

		// RestTemplate or // WebClient

		// RestTemplate
//		RestTemplate restTemplate = new RestTemplate();
//		ResponseEntity<Ticket> response = restTemplate.getForEntity(getUrl, Ticket.class, ticketNumber);
//		Ticket ticket = response.getBody();

		// WebClient
		WebClient webClient = WebClient.create();
		Ticket ticket = webClient.get()     // Create a GET request
				.uri(getUrl, ticketNumber)  // Set the URL with path variable
				.retrieve() 			    // Execute the request
				.bodyToMono(Ticket.class)   // Convert response to Ticket object
				.block(); 					// Wait for response

		return ticket;
	}

}
