package in.inxod.touristBackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.inxod.touristBackend.model.Tourist;
import in.inxod.touristBackend.service.TouristServiceImp;

@RestController
public class TouristController {

	/*
	 * Handle the exception in controller is not good practice
	 */
	@Autowired
	private TouristServiceImp service;
	
	// Add Tourist
	@PostMapping("/reg-tourist")
	public ResponseEntity<String> registerTourist(@RequestBody Tourist tourist){
		String res = service.registerTourist(tourist);
		return new ResponseEntity<String>(res,HttpStatus.CREATED);
	}
	
	// Get tourist by Id
	@GetMapping("/get-tourist/{id}")
	public ResponseEntity<?> getTouristById(@PathVariable("id") Integer id){
		
			Tourist tr = service.fetchTouristById(id);
			return new ResponseEntity<Tourist>(tr,HttpStatus.OK);
	
	}
	
	// Get All tourist
	@GetMapping("/get-Alltourist")
	public ResponseEntity<List> fetchAllTourist(){
		List<Tourist> Touristlist = service.fetchAllTouristInfo();
		return new ResponseEntity<List>(Touristlist,HttpStatus.OK);
	}
	
	
	// Update Tourist
	@PutMapping("/update-tourist")
	public ResponseEntity<String> updateTourist(@RequestBody Tourist tourist){
		
			String res = service.updateTouristInfo(tourist);
			return new ResponseEntity<String>(res,HttpStatus.OK);
		
		
	}
	
	// update by budget
	@PatchMapping("/update-budget/{id}/{budget}")
	public ResponseEntity<String> updateBudget(@PathVariable("id") Integer id , @PathVariable("budget") Double budget){

			String res = service.updateTheTouristBudget(id, budget);
			return new ResponseEntity<String>(res,HttpStatus.OK);
	
	}
	
	// Delete tourist
	@DeleteMapping("/delete-tourist/{id}")
	public ResponseEntity<String> deleteTourist(@PathVariable("id") Integer id){
			String res = service.deleteTouristInfoById(id);
			return new ResponseEntity<String>(res,HttpStatus.OK);		
	}
}













