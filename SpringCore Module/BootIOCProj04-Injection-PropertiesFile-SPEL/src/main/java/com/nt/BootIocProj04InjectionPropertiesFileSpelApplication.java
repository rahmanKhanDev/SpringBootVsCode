package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Institute;

@SpringBootApplication
public class BootIocProj04InjectionPropertiesFileSpelApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=	SpringApplication.run(BootIocProj04InjectionPropertiesFileSpelApplication.class, args);
	Institute institute=ctx.getBean("institute", Institute.class);
	System.out.println(institute);
	}

}
