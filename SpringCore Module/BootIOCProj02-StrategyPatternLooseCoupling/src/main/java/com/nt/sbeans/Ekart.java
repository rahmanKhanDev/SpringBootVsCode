package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("ekart")
public final class Ekart implements ICourier {

	@Override
	public String deliver(int oid) {
		// TODO Auto-generated method stub
		return " order id:"+oid+"is ready to deliver using Ekart";
	}

}
