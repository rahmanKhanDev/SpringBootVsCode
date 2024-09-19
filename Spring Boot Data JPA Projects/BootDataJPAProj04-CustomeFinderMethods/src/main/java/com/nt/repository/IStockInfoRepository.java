package com.nt.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nt.entity.StockInfo;

public interface IStockInfoRepository extends JpaRepository<StockInfo, Integer> {
	public List<StockInfo> getByStockType(String stockType);

	public Iterable<StockInfo> findByStockTypeIn(List<String> stockType);

	public Iterable<StockInfo> findByNameLike(String StockName);

	public Iterable<StockInfo> findByNameStartingWith(String StockName);

	public Iterable<StockInfo> findByCompanyEndingWith(String CompanyName);
}
