package com.nt.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.nt.entity.StockInfo;
import com.nt.repository.IStockInfoRepository;

@Service("stockService")
public class StockInfoServiceImp implements IStockInfoService {

	@Autowired
	private IStockInfoRepository stockRepo;

	@Override
	public String registerStock(StockInfo info) {
		System.out.println("Stock Id before Insertion:" + info.getId());
		int stockId = stockRepo.save(info).getId();
		return "Stock registerd with Id:" + stockId;
	}

	public String registerAllStock(List<StockInfo> list) {
		
		stockRepo.saveAll(list);

		return list.size() + " no. of records inserted";
	}

	@Override
	public boolean stockIsAvailable(Integer id) {
		boolean flag = stockRepo.existsById(id);
		return flag;
	}

	@Override
	public Long countOfStocks() {
		Long count = stockRepo.count();
		return count;
	}

	@Override
	public Iterable<StockInfo> showAllStocks() {

		return stockRepo.findAll();

	}

	@Override
	public Iterable<StockInfo> showAllStocksById(Iterable<Integer> ids) {

		return stockRepo.findAllById(ids);
	}

	@Override
	public Optional<StockInfo> showStockById(Integer id) {
		Optional<StockInfo> opt = stockRepo.findById(id);
		if (opt.isPresent()) {
			return Optional.ofNullable(opt.get());
		} else {
			throw new IllegalArgumentException("Invalid stockId");
		}
	}

	@Override
	public String registerorUpdateStock(StockInfo stock) {

		Optional<StockInfo> opt = stockRepo.findById(stock.getId());
		if (opt.isPresent()) {
			int id = stockRepo.save(stock).getId();
			return id + " Stock Details are found and updated";
		} else {
			int id = stockRepo.save(stock).getId();

			return "Stock is saved with id " + id;
		}

	}

	@Override
	public String deleteStockById(Integer id) {
		Optional<StockInfo> opt = stockRepo.findById(id);
		if (opt.isPresent()) {
			stockRepo.deleteById(id);
			return id + " Stock id deleted";
		} else {
			return "Record not found for deletion";
		}

	}

	@Override
	public String deleteAllStocksById(Iterable<Integer> ids) {
		List<StockInfo> list=(List<StockInfo>) stockRepo.findAllById(ids);

		if(list.size()>0) {
			stockRepo.deleteAllById(ids);
		return list.size()+" no. of records deleted";
		}else {
			return "no records found to be deleted";
		}
	}

	@Override
	public String deleteAllStocks(Iterable<StockInfo> stocks) {
		List<StockInfo> list=(List<StockInfo>) stockRepo.findAllById(List.of(1,52,2));
		stockRepo.deleteAll(stocks);
		return list.size()+" no of records deleted";
	}

}
