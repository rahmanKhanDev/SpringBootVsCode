package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.StockInfo;

public interface IStockInfoRepository extends JpaRepository<StockInfo, Integer> {

//	@Query("from StockInfo")
//	public List<StockInfo> showAllStocks();

//	@Query("from StockInfo where price>=:start and price<=:end")
//	public List<StockInfo>  showAllStocksByPriceRange(double start,double end);

//	@Query("from StockInfo where price>=?1 and price<=?2")
//	public List<StockInfo> showAllStocksByPricerange(@Param("start") double startRange,@Param("end")double endRange);

//	@Query("from StockInfo where price>=:start and price<=:end")
//	public List<StockInfo> showAllStocksByPricerange(@Param("start") double startRange,@Param("end")double endRange);

//	@Query("select name,company,price from StockInfo where stockType IN(?1,?2)")
//	public List<Object[]> showStocksDataByStockType(String stckType1,String stockType2);

//	@Query("select name from StockInfo where id In(:id1,:id2,:id3)")
//	public List<String> showStockNameByStockId(int id1, int id2, int id3);

//	@Query("from StockInfo where name=:stockName")
//	public StockInfo showStockByStockName(String stockName);

//	@Query("Select name,exchange,company,price from StockInfo where id=:id")
//	public Object showStockDataById(Integer id);

	@Query("select stockType from StockInfo where name=:name")
	public String showStockTypeByName(String name);
}
