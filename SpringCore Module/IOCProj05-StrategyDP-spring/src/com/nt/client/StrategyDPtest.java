package com.nt.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.Appconfig;
import com.nt.sbeans.FlipKart;
//main class
public class StrategyDPtest {

	public static void main(String[] args) {
		//create container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		//target class object
		FlipKart fpkt=ctx.getBean("fkart",FlipKart.class);
		//invoke b.method
		String resultMsg=fpkt.shopping(new String[]{"shirt","pant","t-shirt"},new int[] {1000,2000,3000});
		System.out.println(resultMsg);
		ctx.close();
		
		//
	}

}
