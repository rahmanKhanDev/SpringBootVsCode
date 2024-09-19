package com.nt.factory;
import com.nt.comps.BlueDart;
import com.nt.comps.Courier;
import com.nt.comps.DHL;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
//factory class of flipkart dependent class
public class FlipkartFactory {

	//static method for object creation 
	public static Flipkart getInstance(String courierType) {
		Courier courier=null;
		if(courierType.equalsIgnoreCase("DTDC")) {
			courier=new DTDC();
		}
		else if(courierType.equalsIgnoreCase("DHL")) {
			courier=new DHL();
		}
		else if(courierType.equalsIgnoreCase("BlueDart")) {
			courier=new BlueDart();
		}
		else 
			throw new IllegalArgumentException("invalid input");
		Flipkart fpkt=new Flipkart();
		fpkt.setCourier(courier);
		return fpkt;
		
	}
}
