package com.nt.runnner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IStockInfoMgmtService;

@Component
public class PlSQLProcedureTestRunner implements CommandLineRunner {

	@Autowired
	private IStockInfoMgmtService stockService;

	@Override
	public void run(String... args) throws Exception {
		stockService.getStocksByPriceRange(500.00,1500.00).forEach(System.out::println);

	}

}
