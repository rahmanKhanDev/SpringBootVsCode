package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	//target class has-proverty
private Courier courier;
//setter method
public void setCourier(Courier courier) {
	this.courier=courier;
}
//b.method
public String shopping(String item[],int price[]) {
	//Billing amount
	int billAmount=0;
	for(int p:price) {
		billAmount=billAmount+p;
	}
	//order item number
	int oid=new Random().nextInt(1000);
	//calling deliver method of dependent class
	   String msg=courier.deliver(oid);
	   //method return
	   return Arrays.toString(item) +" items with prices "+ Arrays.toString(price)+" bill amount.."+billAmount+"--"+msg;
	
}
}
