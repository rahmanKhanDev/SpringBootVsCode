package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;
import com.nt.repository.IStockInfoRepository;

@Service
public class StockInfoServiceImp implements IStockMgmtService {

	@Autowired
	private IStockInfoRepository stockRepo;

	@Override
	public List<StockInfo> findAllStocksByFiltering(StockInfo info, boolean asc, String... props) {
		Sort sort = Sort.by(asc ? Direction.ASC : Direction.DESC, props);
		Example<StockInfo> example = Example.of(info);
		return stockRepo.findAll(example, sort);
	}

	@Override
	public String deleteStocksByIdInBatch(Iterable<Integer> ids) {
		List<StockInfo> list = stockRepo.findAllById(ids);
		if (!list.isEmpty()) {
			stockRepo.deleteAllByIdInBatch(ids);
			return list.size() + " no of records deleted";
		} else {
			return "no records found";
		}
	}

	@Override
	public StockInfo findstockByReferenceId(Integer id) {
		StockInfo info=stockRepo.getReferenceById(id);
		return info;
	}

}
