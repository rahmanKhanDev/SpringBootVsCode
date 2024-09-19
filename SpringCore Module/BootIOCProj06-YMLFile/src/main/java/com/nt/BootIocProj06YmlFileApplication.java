package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;
import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootIocProj06YmlFileApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootIocProj06YmlFileApplication.class, args);
	Company company=ctx.getBean("comp",Company.class);
	Customer customer=ctx.getBean("cust",Customer.class);
	System.out.println(company);
	System.out.println(customer);
	((ConfigurableApplicationContext) ctx).close();
	}

}
