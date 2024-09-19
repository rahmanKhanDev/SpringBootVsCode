package com.nt.service;

import java.util.List;

import com.nt.entity.StockInfo;

public interface IStockMgmtService {

	public List<StockInfo> findAllStocksByFiltering(StockInfo info,boolean asc,String... props);
	public String deleteStocksByIdInBatch(Iterable<Integer> ids);
	public StockInfo findstockByReferenceId(Integer id);
}
