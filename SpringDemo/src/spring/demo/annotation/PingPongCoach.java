package spring.demo.annotation;

import org.springframework.stereotype.Component;

@Component
public class PingPongCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "This si get Daily workout";
	}

	@Override
	public String getDailyFortune() {
		
		return "This is get Daily fortune";
	}

}
