package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IPurchesaseOrder;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private IPurchesaseOrder orderService;
	@Override
	public void run(String... args) throws Exception {
		String resultMsg=orderService.purchase(new String[] {"shirt","pant","t-shirt","trouser"}, new double[] {1000,2000,3000,4000}, new String[] {"arkhan00555@gmail.com","tiwednesday1@gmail.com","m.saklainraza7541@gmail.com"});
		System.out.println(resultMsg);

	}

}
