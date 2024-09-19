package com.nt.runner;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IStockInfoRepository;

@Component
public class QueryMethodTestRunner implements CommandLineRunner {

	@Autowired
	private IStockInfoRepository stockRepo;

	@Override
	public void run(String... args) throws Exception {

//	stockRepo.showAllStocks().forEach(System.out::println);
		// stockRepo.showAllStocksByPricerange(1500,
		// 3000).forEach(System.out::println);;
//		List<Object[]> list = stockRepo.showStocksDataByStockType("Power", "RealEstate");
//		list.forEach(row -> {
//			for(Object obj:row) {
//				System.out.print(obj+" ");
//			}
//			System.out.println();
//		});
//	}
//		List<String> list = stockRepo.showStockNameByStockId(252, 253, 204);
//		list.forEach(CompanyName->{
//			System.out.print(CompanyName+" ");
//		});

//		System.out.println(stockRepo.showStockByStockName("BHEL"));
//		Object row[] = (Object[]) stockRepo.showStockDataById(253);
//		System.out.println("Stock Data::" + Arrays.toString(row));

		System.out.println(stockRepo.showStockTypeByName("BHEL"));
	}
}
