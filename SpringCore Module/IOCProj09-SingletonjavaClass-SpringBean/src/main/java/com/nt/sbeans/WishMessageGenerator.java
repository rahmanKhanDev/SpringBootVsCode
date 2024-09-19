package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("wmg")
//@Scope("singleton")
@Scope("prototype")
public class WishMessageGenerator {
	
 
	@Autowired  // Field injection
	private LocalDateTime dateTime;
	
	// Business method
	public String showWishMessage(String user) {
		//get current hour
		int hour=dateTime.getHour();
		//generate wishMessage
		if(hour<12)
			return "GM dear:"+user;
		else if(hour>=12&& hour <16)
			return "GA dear:"+user;
		else if(hour>=16&&hour<20)
			return "GE dear:"+user;
		else 
			return "GN dear:"+user;
	}
}
