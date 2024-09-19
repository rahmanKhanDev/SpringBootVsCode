package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;
import com.nt.sbeans.Customer;
import com.nt.sbeans.MyClass;

@SpringBootApplication
public class BootIocProj05BulkInjection2Application {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIocProj05BulkInjection2Application.class, args);
	Company company=ctx.getBean("comp",Company.class);
	System.out.println("Company data:"+company);
	Customer customer=ctx.getBean("customer",Customer.class);
	System.out.println("Customer data:"+customer);
	MyClass myInfo=ctx.getBean("my",MyClass.class);
	System.out.println(myInfo);
	((ConfigurableApplicationContext) ctx).close();
	}

}
