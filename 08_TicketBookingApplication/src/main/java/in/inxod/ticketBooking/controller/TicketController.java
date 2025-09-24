package in.inxod.ticketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.inxod.ticketBooking.model.Passenger;
import in.inxod.ticketBooking.model.Ticket;
import in.inxod.ticketBooking.service.TicketServiceImpl;

@Controller
public class TicketController {

	@Autowired
	private TicketServiceImpl service;
	
	@GetMapping("/get-form")
	public String bookTicketView(@ModelAttribute Passenger passenger, Model model) {
		return "index";
	}
	@GetMapping("/ticket-form")
	public String getTicketForm(@ModelAttribute Passenger passenger, Model model) {
		return "ticket-form";
	}
	@GetMapping("/get-ticket")
	public String getTicketForm(@RequestParam("ticketNumber") int ticketNumber, Model model) {
		Ticket ticket = service.generateTicket(ticketNumber);
		model.addAttribute("ticket", ticket);
		return "ticket-info";
	}
	
	@PostMapping("/book-ticket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model) {
		int ticketNumber = service.registerPassenger(passenger);
		model.addAttribute("ticketNumber", ticketNumber);
		return "index";
		
	}
}
