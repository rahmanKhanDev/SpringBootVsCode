package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("dhl")
public final class DHL implements ICourier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return "order id:"+oid +" is ready to deliver using DHL";
	}

}
