package in.inxod.hateoas.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.hateoas.model.Course;

@RestController
public class CourseController {
	
	@GetMapping("/course-info")
	public ResponseEntity<Course> getCourseInfo(){
		Course course1 = new Course(1,"SpringAI",7999.0);
	    Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CourseController.class)
				.getAllCourseInfo()).withRel("Get All Courses");
		course1.add(link);
		return new ResponseEntity<Course>(course1,HttpStatus.OK);
		
	}
	@GetMapping("/all-course-info")
	public ResponseEntity<List> getAllCourseInfo(){
		Course course1 = new Course(1,"SpringAI",7999.0);
		Course course2 = new Course(2,"Core Java",5699.0);
		Course course3 = new Course(3,"Machine Learning",1799.0);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(course1);
		courseList.add(course2);
		courseList.add(course3);
		return new ResponseEntity<List>(courseList,HttpStatus.OK);
		
	}
}
