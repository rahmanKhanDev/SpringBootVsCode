package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.controller.CountryController;
import com.nt.model.Country;

@SpringBootApplication
public class BootIocProj03MiniProjectLayerdAppPracticeApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootIocProj03MiniProjectLayerdAppPracticeApplication.class, args);
	CountryController controllerObj =ctx.getBean("controller",CountryController.class);
	try {
		List<Country> list=controllerObj.getAllCountryByName("India","Japan","USA");
		list.forEach(country->{
			System.out.println(country);
		});
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((ConfigurableApplicationContext) ctx).close();
	
	}

}
