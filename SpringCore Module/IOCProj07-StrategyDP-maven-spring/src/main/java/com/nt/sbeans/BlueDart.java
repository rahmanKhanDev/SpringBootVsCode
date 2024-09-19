package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//dependet class1
@Component("bdart")
@Lazy(true)
public class BlueDart implements ICourier {

	public BlueDart() {
		System.out.println("BlueDart::0-param-constructor");
	}
	
	@Override
	public String delivery(int oid) {
		
		return "order no "+oid+" is ready for delivery by BlueDart";
	}

}
