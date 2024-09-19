package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Filpkart;

@ImportResource("com/nt/config/applicationContext.xml")
@SpringBootApplication
public class BootIocProj02StrategyPatternLooseCouplingApplication {

	public static void main(String[] args) {
	ApplicationContext ctx=SpringApplication.run(BootIocProj02StrategyPatternLooseCouplingApplication.class, args);
	Filpkart fpkt=ctx.getBean("fpkt", Filpkart.class);
	
      String finalMsg=fpkt.shopping(new String[]{"shirt","t-shirt","pant"}, new double[]{1000,2000,5000});
      System.out.println(finalMsg);
	}

}
