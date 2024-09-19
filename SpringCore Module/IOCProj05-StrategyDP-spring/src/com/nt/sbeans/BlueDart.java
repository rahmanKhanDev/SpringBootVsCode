package com.nt.sbeans;

import org.springframework.stereotype.Component;

//dependet class1
@Component("bdart")

public class BlueDart implements ICourier {

	@Override
	public String delivery(int oid) {
		
		return "order no "+oid+" is ready for delivery by BlueDart";
	}

}
