package in.inxod.hateoas.model;

import org.springframework.hateoas.RepresentationModel;

public class Course extends RepresentationModel{
	

	private Integer id;
	private String course;
	private Double price;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Course(Integer id, String course, Double price) {
		super();
		this.id = id;
		this.course = course;
		this.price = price;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
}
