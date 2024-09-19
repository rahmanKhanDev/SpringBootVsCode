package com.nt.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nt.entity.StockInfo;

public interface IStockInfoRepository extends PagingAndSortingRepository<StockInfo, Integer>,CrudRepository<StockInfo,Integer> {

}
