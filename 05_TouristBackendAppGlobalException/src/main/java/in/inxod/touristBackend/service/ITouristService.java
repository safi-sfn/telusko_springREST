package in.inxod.touristBackend.service;

import java.util.List;

import in.inxod.touristBackend.model.Tourist;

public interface ITouristService {
	
	// Add Tourist
	String registerTourist(Tourist tourist);
	
	// Get tourist by Id
	Tourist fetchTouristById(Integer id);
	
	// Get All tourist
	List<Tourist> fetchAllTouristInfo();
	
	// Update Tourist
	String updateTouristInfo(Tourist tourist);
	
	// update by budget
	String updateTheTouristBudget(Integer id, Double budget);
	
	// Delete tourist
	String deleteTouristInfoById(Integer id);
}
