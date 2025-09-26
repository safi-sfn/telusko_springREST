package in.inxod.ticketBooking.service;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;

public interface TicketService {
	
	int registerPassenger(Passenger passenger);
	
	Ticket getTicket(int id);
}
