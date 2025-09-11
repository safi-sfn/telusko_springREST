package in.inxod.greeting.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.greeting.service.IGreetingService;

//@Controller + @ResopnseBody  = @RestController
@RestController
public class GreetingController {

	@Autowired	
	private IGreetingService service;
	
	@GetMapping("/greet1")
//	@ResponseBody
	public String getWish() {
		return service.generateGreeting();
	}
	
	@GetMapping("/greet2")
//	@ResponseBody
	public ResponseEntity<String> getWish2() {
		String response = service.generateGreeting();
		return new ResponseEntity<String>(response,HttpStatus.OK);
	}
}
