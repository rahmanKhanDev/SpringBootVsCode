package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.StockInfo;

public interface IStockInfoService {

	public String registerStock(StockInfo info);
	public String registerAllStock(List<StockInfo> list);
	public boolean stockIsAvailable(Integer id);
	public Long countOfStocks();
	public Iterable<StockInfo> showAllStocks();
	public Iterable<StockInfo> showAllStocksById(Iterable<Integer> ids);
	public Optional<StockInfo> showStockById(Integer id);
	public String registerorUpdateStock(StockInfo stock);
	public String deleteStockById(Integer id);
	public String deleteAllStocksById(Iterable<Integer> ids);
	public String deleteAllStocks(Iterable<StockInfo> stocks);
}
