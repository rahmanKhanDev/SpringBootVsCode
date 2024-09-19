package com.nt.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.service.IStockMgmtService;

@Component
public class JPAReopsitoryTestRunner implements CommandLineRunner {

	@Autowired
	private IStockMgmtService stockService;

	@Override
	public void run(String... args) throws Exception {
//		StockInfo info = new StockInfo(null, null, null, null, null, null, "Technology");
//		stockService.findAllStocksByFiltering(info, true, "id").forEach(System.out::println);

//		String msg=stockService.deleteStocksByIdInBatch(List.of(104,202,203,204,205,206,207,208,209,210,211,212,213));
//		System.out.println(msg);
		
		
	Object id=stockService.findstockByReferenceId(256).getId();
	System.out.println(id);
	String exchange=stockService.findstockByReferenceId(256).getExchange();
	System.out.println(exchange);
	
	
	}

}
