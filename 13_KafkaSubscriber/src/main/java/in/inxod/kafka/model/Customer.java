package in.inxod.kafka.model;

public class Customer {

	private Integer id;
	private String name;
	private String city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Customer(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
