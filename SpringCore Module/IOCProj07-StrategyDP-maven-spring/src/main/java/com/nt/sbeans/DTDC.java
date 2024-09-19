package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

//dependent class3
@Component("dtdc")
@Lazy(true)
public class DTDC implements ICourier {

	public DTDC() {
		System.out.println("DTDC::0-param-constructor");
	}
	
	
	@Override
	public String delivery(int oid) {
		
		return " order no "+oid+" is reday for delivery by DTDC";
	}

}
