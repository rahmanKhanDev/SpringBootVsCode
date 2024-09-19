package com.nt.comps;

public class HeroHonda implements Bike {
	public HeroHonda() {
		System.out.println("HeroHonda::0-param-constructor");
	}
	
	@Override
	public void drive() {
		System.out.println("HeroHonda:: Driving Hero Honda bike");

	}

}
