package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.StockInfo;

public interface IStockInfoRepository extends JpaRepository<StockInfo, Integer> {

}
