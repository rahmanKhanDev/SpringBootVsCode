package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//dependent class2
@Component("dhl")
@Lazy(true)
public class DHL implements ICourier {

	
	public DHL() {
		System.out.println("DHL::0-param-constructor");
	}
	
	@Override
	public String delivery(int oid) {
		
		return "order no "+oid+" is ready for delivery by DHL";
	}

}
