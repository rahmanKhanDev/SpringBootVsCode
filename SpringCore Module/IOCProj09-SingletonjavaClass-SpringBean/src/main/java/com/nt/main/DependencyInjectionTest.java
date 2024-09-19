package com.nt.main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
	
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
	   
		//target class object
		WishMessageGenerator generator1=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator2=ctx.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator generator3=ctx.getBean("wmg",WishMessageGenerator.class);
		
		System.out.println(generator1.hashCode()+" "+generator2.hashCode()+" "+generator3.hashCode());
		
		System.out.println("generator1==generator2?"+(generator1==generator2));
		System.out.println("generator2==generator3?"+(generator2==generator3));
		System.out.println("generator1==generator3?"+(generator1==generator3));
		
		//invoke b.method
		String resultMsg=generator1.showWishMessage("Sonu");
		System.out.println(resultMsg);
		
		System.out.println(Arrays.toString(ctx.getBeanDefinitionNames()));
		
		//close the container
		ctx.close();
	}

}
