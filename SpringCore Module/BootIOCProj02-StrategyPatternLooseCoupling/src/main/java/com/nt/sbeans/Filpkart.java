package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Filpkart {

	@Autowired
	@Qualifier("supplier")
	private ICourier courier;
	
	//b.method
	public String shopping(String items[],double[] price) {
		double billAmount = 0;
		for(Double p:price)
		{
			billAmount+=p;
		}
	      int oid=new Random().nextInt(10000);
	      String msg=courier.deliver(oid);
	      
		return "items "+Arrays.toString(items)+" having billamount "+billAmount+", "+msg;
		
		
	}
}
