package com.nt.sbeans;

import org.springframework.stereotype.Component;

//dependent class3
@Component("dtdc")
public class DTDC implements ICourier {

	@Override
	public String delivery(int oid) {
		
		return " order no "+oid+" is reday for delivery by DTDC";
	}

}
