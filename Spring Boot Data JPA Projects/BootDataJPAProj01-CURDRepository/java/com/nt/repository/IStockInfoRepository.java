package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.StockInfo;

public interface IStockInfoRepository extends CrudRepository<StockInfo, Integer> {

}
