package in.inxod.profiles.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("greet")
public class GreetingServiceImpl implements IGreetingService {

	@Autowired
	LocalTime time;
	
	@Override
	public String generateGreeting() {
		
		int hour = time.getHour();
		if(hour<12) {
			return "Hello Good Morning";
		}
		else if(hour<16){
			return "Hello Good Afternoon";
		}
		else if(hour<20) {
			return "Hello Good evining";
		}
		return "Hello Good Night";
	}

	@Override
	public String generateBirthdayWish() {
		
		return "Happy Birthady";
	}

}
