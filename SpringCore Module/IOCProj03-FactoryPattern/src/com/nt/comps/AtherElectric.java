package com.nt.comps;

public class AtherElectric implements Bike {

	public AtherElectric() {
		System.out.println("AtherElectric::0-param-constructor");
	}
	@Override
	public void drive() { 
          System.out.println("AtherElectric:: Driving AtherEcletric bike");
	}

}
