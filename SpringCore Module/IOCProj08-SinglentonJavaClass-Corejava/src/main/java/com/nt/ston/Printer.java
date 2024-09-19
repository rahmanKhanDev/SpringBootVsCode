package com.nt.ston;

public class Printer {

	//static referecee variable of singleton class to refer that single object
	private static Printer INSTANCE;
	
	
	//private constructor(closing doors to create object outside class using new operator)
	private Printer() {
		System.out.println("Printer::0-param-constructor");
		
	}
	
	//public static fatory method
	public static Printer getInstance() {
		if(INSTANCE==null)
		INSTANCE=new Printer();
		
		
		return INSTANCE;
	}
	
	
	//b.method
	public void print(String msg) {
		System.out.println(msg);
	}
}
