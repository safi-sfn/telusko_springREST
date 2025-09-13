package in.inxod.touristBackend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.inxod.touristBackend.exception.TouristNotFoundException;
import in.inxod.touristBackend.model.Tourist;
import in.inxod.touristBackend.repository.ITouristRepository;

@Service
public class TouristServiceImp implements ITouristService {

	@Autowired
	private ITouristRepository repo;
	
	// Add Tourist
	@Override
	public String registerTourist(Tourist tourist) {
		Tourist tr = repo.save(tourist);
		return "Tourist is Registered with id : "+tr.getId();
	}
	
	
	// Get tourist by Id
	@Override
	public Tourist fetchTouristById(Integer id) {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}else {
			throw new TouristNotFoundException("Tourist with given id is not found");
		}
		
//		return repo.findById(id).orElseThrow(()-> new TouristNotFoundException("Tourist with given id is not found"));
	
	}

	// Get All tourist
	@Override
	public List<Tourist> fetchAllTouristInfo() {
		
		return repo.findAll();
	}

	// Update Tourist
	@Override
	public String updateTouristInfo(Tourist tourist) {
		Optional<Tourist>optional = repo.findById(tourist.getId());
		if(optional.isPresent()) {
			repo.save(tourist);
			return "Tourist info updated successfully";
		}
		throw new TouristNotFoundException("Tourist not found with this id "+tourist.getId());
	}

	
	// update by budget
	@Override
	public String updateTheTouristBudget(Integer id, Double budget) {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent())
		{
			Tourist tourist=optional.get();
			tourist.setBudget(budget);
			repo.save(tourist);
			return "Tourist info updated successfully";
			
		}
		throw new TouristNotFoundException("Tourist with given id is not found");
	}

	
	// Delete tourist
	@Override
	public String deleteTouristInfoById(Integer id) {
		Optional<Tourist> optional = repo.findById(id);
		if(optional.isPresent())
		{
			repo.deleteById(id);
			return "Tourist record for the given id is deleted";
			
		}
		throw new TouristNotFoundException("Tourist with given id is not found");
	}

}
