package in.inxod.ticketBooking.model;



public class Ticket {

	private Integer ticketNumber;
	private String status;
	private Double ticketPrice;
	private String name;
	private String arrival;
	private String departure;
	private String dateOfJourney;
	public Integer getTicketNumber() {
		return ticketNumber;
	}
	public void setTicketNumber(Integer ticketNumber) {
		this.ticketNumber = ticketNumber;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(Double ticketPrice) {
		this.ticketPrice = ticketPrice;
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
	
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Ticket(Integer ticketNumber, String status, Double ticketPrice, String name, String arrival,
			String departure, String dateOfJourney) {
		super();
		this.ticketNumber = ticketNumber;
		this.status = status;
		this.ticketPrice = ticketPrice;
		this.name = name;
		this.arrival = arrival;
		this.departure = departure;
		this.dateOfJourney = dateOfJourney;
	}
	@Override
	public String toString() {
		return "Ticket [ticketNumber=" + ticketNumber + ", status=" + status + ", ticketPrice=" + ticketPrice
				+ ", name=" + name + ", arrival=" + arrival + ", departure=" + departure + ", dateOfJourney="
				+ dateOfJourney + "]";
	}
	
	
}
