package com.nt.sbeans;

import org.springframework.stereotype.Component;

//dependent class2
@Component("dhl")

public class DHL implements ICourier {

	@Override
	public String delivery(int oid) {
		
		return "order no "+oid+" is ready for delivery by DHL";
	}

}
