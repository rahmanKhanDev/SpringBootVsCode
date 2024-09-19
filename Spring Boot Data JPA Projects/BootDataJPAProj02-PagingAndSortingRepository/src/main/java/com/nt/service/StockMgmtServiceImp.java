package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;
import com.nt.repository.IStockInfoRepository;


@Service
public class StockMgmtServiceImp implements IStockMgmtService {

	@Autowired
	private IStockInfoRepository stockRepo;
	
	@Override
	public Iterable<StockInfo> showSortedStocks(boolean asc, String... props) {
		
	Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);	
	Iterable<StockInfo> stocks=stockRepo.findAll(sort);
		return stocks;
	}

	@Override
	public Page<StockInfo> showStocksByPageNumber(int pageno, int pagesize, boolean asc, String... props) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC, props);
		Pageable pageable=PageRequest.of(pageno, pagesize, sort);
		Page<StockInfo> page=stockRepo.findAll(pageable);
		return page;
	}

}
