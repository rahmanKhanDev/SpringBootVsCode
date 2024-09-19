package com.nt.client;

import com.nt.comps.Bike;
import com.nt.factory.Bikefactory;

public class FactoryDpTest {

	public static void main(String args[]) {
		Bike bike1=Bikefactory.getBikeInstance("luxory");
		bike1.drive();
		System.out.println("==================");
		
		Bike bike2=Bikefactory.getBikeInstance("Electric");
		bike2.drive();
		System.out.println("==================");
		
		Bike bike3=Bikefactory.getBikeInstance("economy");
		bike3.drive();
		
	}
}
