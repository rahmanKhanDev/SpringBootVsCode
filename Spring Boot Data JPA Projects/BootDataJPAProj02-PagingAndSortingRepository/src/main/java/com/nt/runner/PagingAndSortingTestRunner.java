package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import com.nt.entity.StockInfo;
import com.nt.service.IStockMgmtService;

@Component
public class PagingAndSortingTestRunner implements CommandLineRunner {
	@Autowired
	private IStockMgmtService stockService;

	@Override
	public void run(String... args) throws Exception {

		try {
			// stockService.showSortedStocks(false, "id").forEach(System.out::println);

			Page<StockInfo> page = stockService.showStocksByPageNumber(1, 3, false, "price");
			if (!page.isEmpty()) {
				page.forEach(System.out::println);
			} else {
				System.out.println("no page found");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}
}