package in.inxod.ticketBooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;
import in.inxod.ticketBooking.repository.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository repo;
	
	@Override
	public int registerPassenger(Passenger passenger) {
		
		 Passenger pass = repo.save(passenger);
		 Integer ticketNumber = pass.getId();
		 return ticketNumber;
	}

	@Override
	public Ticket getTicket(int id) {
		
		Optional<Passenger> optional =  repo.findById(id);
		Passenger passenger = optional.get();
		Ticket ticket = new Ticket();
		ticket.setTicketNumber(passenger.getId());
		ticket.setName(passenger.getName());
		ticket.setDeparture(passenger.getDeparture());
		ticket.setArrival(passenger.getArrival());
		ticket.setStatus("Confirmed");
		ticket.setDateOfJourney(passenger.getDateOfJourney());
		ticket.setTicketPrice(2350.0);
		return ticket;
		
		
		
	}

}












