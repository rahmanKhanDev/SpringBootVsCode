package com.nt.comps;

public class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		
		return " order no "+oid+" is ready for delivery by DTDC";
	}

}
