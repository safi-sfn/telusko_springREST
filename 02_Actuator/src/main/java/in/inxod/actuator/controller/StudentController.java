package in.inxod.actuator.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.actuator.model.Student;



@RestController
public class StudentController {

	@GetMapping("/get-info")
	public ResponseEntity<Student> getStudentInfo(){
		Student stu = new Student(1,"Rahul","Haryana",32);
		return new ResponseEntity<Student>(stu, HttpStatus.OK);
	}
	
	@PostMapping("/add-student")
	public ResponseEntity<String> addStudent(@RequestBody Student stu){
		System.out.println(stu);
		String res = "Student Added successfully";
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
	}
}
