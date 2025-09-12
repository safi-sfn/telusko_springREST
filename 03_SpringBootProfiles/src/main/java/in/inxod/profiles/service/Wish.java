package in.inxod.profiles.service;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"wish","w"})
public class Wish implements IGreetingService {

	@Autowired
	LocalTime time;
	
	@Override
	public String generateGreeting() {
		
		int hour = time.getHour();
		if(hour<12) {
			return "Good Morning";
		}
		else if(hour<16){
			return "Good Afternoon";
		}
		else if(hour<20) {
			return "Good evining";
		}
		return "Good Night";
	}

	@Override
	public String generateBirthdayWish() {
		
		return "Happy Birthady";
	}

}
