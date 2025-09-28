package in.inxod.actuator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.actuator.model.Course;

@RestController
public class CourseController {

	// for receiving xml type of data . we have to add these following attributes
	@PostMapping(value="/add-course",consumes={"application/xml","application/json"})
	public ResponseEntity<String> addCourseInfo(@RequestBody Course course){
		
		String msg = "Course info added";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED);
	}
	
	// for produce xml type of data . we have to add these following attributes
	@GetMapping(value="/get-course",produces={"application/xml","application/json"})
	public ResponseEntity<Course> getCourseInfo(){
		Course course = new Course(1,"Spring Boot",499.0);
		return new ResponseEntity<Course>(course, HttpStatus.OK);
	}
}
