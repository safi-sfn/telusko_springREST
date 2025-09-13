package in.inxod.touristBackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tourist")
public class Tourist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tourist_id")
	private Integer id;
	@Column(name="tourist_name")
	private String name;
	private String city;
    private String packageType;
	private Double budget;
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
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public Double getBudget() {
		return budget;
	}
	public void setBudget(Double budget) {
		this.budget = budget;
	}
	public Tourist(String name, String city, String packageType, Double budget) {
		super();
		this.name = name;
		this.city = city;
		this.packageType = packageType;
		this.budget = budget;
	}
	public Tourist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
