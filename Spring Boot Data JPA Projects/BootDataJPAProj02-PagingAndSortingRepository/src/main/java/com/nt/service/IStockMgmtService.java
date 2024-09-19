package com.nt.service;

import org.springframework.data.domain.Page;
import com.nt.entity.StockInfo;

public interface IStockMgmtService {
public Iterable<StockInfo> showSortedStocks(boolean asc,String... props);
public Page<StockInfo> showStocksByPageNumber(int pageno,int pagesize, boolean asc,String...props);
}
