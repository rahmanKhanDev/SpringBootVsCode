package com.nt.factory;
import com.nt.comps.*;

public class Bikefactory {

	//public static  method
	public static Bike getBikeInstance(String type) {
		Bike bike=null;
	if(type.equalsIgnoreCase("Electric"))
		return new AtherElectric();
	else if(type.equalsIgnoreCase("luxory"))
		return new Harley_DavidSon();
	else if (type.equalsIgnoreCase("economy"))
		return new HeroHonda();
	else
		throw new IllegalArgumentException("Invalid input");
	
	}
}
