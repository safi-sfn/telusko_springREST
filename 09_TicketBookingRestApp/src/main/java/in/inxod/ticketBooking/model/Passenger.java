package in.inxod.ticketBooking.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Passenger {

	@Id
	private Integer id;
	private String name;
	private String arrival;
	private String departure;
	private String dateOfJourney;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArrival() {
		return arrival;
	}
	public void setArrival(String arrival) {
		this.arrival = arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public void setDeparture(String departure) {
		this.departure = departure;
	}
	public String getDateOfJourney() {
		return dateOfJourney;
	}
	public void setDateOfJourney(String dateOfJourney) {
		this.dateOfJourney = dateOfJourney;
	}
	public Passenger(Integer id, String name, String arrival, String departure, String dateOfJourney) {
		super();
		this.id = id;
		this.name = name;
		this.arrival = arrival;
		this.departure = departure;
		this.dateOfJourney = dateOfJourney;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
