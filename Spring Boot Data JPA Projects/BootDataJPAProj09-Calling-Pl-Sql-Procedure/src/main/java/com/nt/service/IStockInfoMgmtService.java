package com.nt.service;

import java.util.List;

import com.nt.entity.StockInfo;

public interface IStockInfoMgmtService {

	public List<StockInfo> getStocksByPriceRange(double start,double end);
	
}
