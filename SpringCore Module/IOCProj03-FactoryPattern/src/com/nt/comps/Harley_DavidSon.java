package com.nt.comps;


public class Harley_DavidSon implements Bike {
    
	public Harley_DavidSon() {
		System.out.println("Harley_DavidSon::0-param-constructor");
	}
	@Override
	public void drive() {
		System.out.println("Harley_DavidSon:: Driving the super bike Harley_DavidSon");

	}

}
