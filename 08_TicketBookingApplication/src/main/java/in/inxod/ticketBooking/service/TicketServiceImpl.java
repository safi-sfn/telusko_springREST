package in.inxod.ticketBooking.service;

import org.springframework.stereotype.Service;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;

@Service
public class TicketServiceImpl implements TicketService {

	@Override
	public int registerPassenger(Passenger passenger) {
		// RestTemplate  or // WebClient
		
		return 0;
	}

	@Override
	public Ticket generateTicket(int ticketNumber) {
		
		// RestTemplate  or // WebClient
		
		return null;
	}

}
