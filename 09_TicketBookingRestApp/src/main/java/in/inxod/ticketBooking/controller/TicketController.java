package in.inxod.ticketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;
import in.inxod.ticketBooking.service.TicketService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;


@RestController
@Tag(name="Ticket Booking API Controller", description="This API will Store Passenger Info and Generate Ticket")
public class TicketController {
	
	@Autowired
	private TicketService service;
	
	@PostMapping("/get-ticketNumber")
	@Operation(summary="POST Operation", description="This API method will receive Passenger Type Data and Generate Ticket Number")
	public ResponseEntity<Integer> generateTicketNumber(@RequestBody Passenger passenger){
		
		int ticketNumber = service.registerPassenger(passenger);
		return new ResponseEntity<Integer>(ticketNumber, HttpStatus.CREATED);
		
	}
	@GetMapping("/get-ticket/{ticketNumber}")
	@Operation(summary="GET Operation", description="This API method will Accept ticket Number and generate Full Ticket")
	public ResponseEntity<Ticket> generateTicket(@PathVariable("ticketNumber") int ticketNumber){
		Ticket ticket = service.getTicket(ticketNumber);
		return new ResponseEntity<Ticket>(ticket,HttpStatus.OK);
	}
	 

}











