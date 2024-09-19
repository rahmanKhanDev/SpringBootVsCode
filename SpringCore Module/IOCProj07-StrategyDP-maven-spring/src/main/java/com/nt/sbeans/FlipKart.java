package com.nt.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//target class
@Component("fkart")
public class FlipKart {
   
	public FlipKart() {
		System.out.println("FlipKart::0-param-constructor");
	}
	
	//has-a property
    @Autowired
    @Qualifier("dhl")
	private ICourier courier;
	
	//b.method
	public String shopping(String items[],int price[]) {
		System.out.println("b.method invoked");
		
		int billAmount=0;
		for(int p:price) {
			billAmount=billAmount+p;
		}
		//generate oid 
		int oid=new Random().nextInt(1000);
		
		//invoke delivery method of dependent class
		String msg=courier.delivery(oid);
		
		return Arrays.toString(items)+" items with prices "+Arrays.toString(price)+" bill amount.."+billAmount+"--"+msg;
		
		
	}
}
