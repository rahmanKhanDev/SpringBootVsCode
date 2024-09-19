package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.StockInfo;
import com.nt.repository.IStockInfoRepository;
import com.nt.service.IStockInfoService;

@Component
public class CurdRepositoryTest implements CommandLineRunner {

	@Autowired
	private IStockInfoService stockService;
	@Autowired
	private IStockInfoRepository stockRepo;

	@Override
	public void run(String... args) throws Exception {

		try {
			StockInfo info1 = new StockInfo("JIO", "NSE", "Reliance", 2487.65, 330000.00,"Technology");
			StockInfo info2 = new StockInfo("Adani Total Gas", "BSE", "Adani Power", 3100.45, 325000.45,"Power");
			StockInfo info3 = new StockInfo("DLF", "BSE", "DLF", 1687.20, 237000.00,"RealEstate");
			StockInfo info4 = new StockInfo("Bank Of India", "BSE", "BOI", 2434.65, 332000.00,"Finance");
			StockInfo info5 = new StockInfo("Kotak Mahindra Bank", "BSE", "Kotak", 2210.45, 343000.45,"Finance");
			StockInfo info6 = new StockInfo("BHEL", "NSE", "Bhel", 1387.0, 21000.00,"Power");
			StockInfo info7 = new StockInfo("CYBER MEDIA", "NSE", "Cyber Media", 1200.65, 33340.00,"Technology");
			StockInfo info8 = new StockInfo("DECCAN CEMENTS", "BSE", "Deccan Group", 2345.40,2325120.45,"RealEstate");
			StockInfo info9 = new StockInfo("TATA STEEL", "NSE", "TATA GROUP", 3489.20,650975.00,"RealEstate");
			StockInfo info10 = new StockInfo("AIRTEL", "BSE", "Airtel", 3400.65, 334500.00,"Technology");
			StockInfo info11= new StockInfo("ADITYA BIRLA", "NSE", "Birla Group", 3100.45, 325000.45,"Power");
			StockInfo info12 = new StockInfo("SBI", "NSE", "SBI", 1687.20, 237000.00,"Finance");
//	        String ResultMsg=stockService.registerStock(info1);
//	        System.out.println(ResultMsg);

			// passing list of StockInfo obj
			String msg = stockService.registerAllStock(List.of(info1, info2, info3,info4,info5,info6,info7,info8,info9,info10,info11,info12));
			System.out.println(msg);

//			boolean flag = stockService.stockIsAvailable(101);
//			if (flag) {
//				System.out.println("Stock is available");
//			} else {
//				System.out.println("Stock is not available");
//			}

//			Long count=stockService.countOfStocks();
//			System.out.println("Count of records::"+count);

//			Iterable<StockInfo> list = stockService.showAllStocks();
//			list.forEach(stock -> {
//				System.out.println(stock);
//			});

//			list.forEach(System.out::println);

//	      Iterable<StockInfo> stocks=stockService.showAllStocksById(List.of(1,2,6));
//	      stocks.forEach(System.out::println);

//			stockService.showAllStocksById(List.of(1, 2, 3)).forEach(System.out::println);

//		    Optional<StockInfo> stock=stockService.showStockById(3);
//			System.out.println(stock);

//			StockInfo stock=new StockInfo(152,"Aditya Birla","NSE","Birla Group",2043.87,430000.65);
//			String msg=stockService.registerorUpdateStock(stock);

//			String msg=stockService.deleteStockById(150);
//			System.out.println(msg);

//			String msg=stockService.deleteAllStocksById(List.of(4,102,103));
//			System.out.println(msg);
//			Iterable<StockInfo> list = stockRepo.findAllById(List.of(1, 52, 2));
//			String msg = stockService.deleteAllStocks(list);
//			System.out.println(msg);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
