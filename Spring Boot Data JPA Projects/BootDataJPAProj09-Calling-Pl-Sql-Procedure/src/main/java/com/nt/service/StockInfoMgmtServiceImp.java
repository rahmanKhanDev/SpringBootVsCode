package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.StockInfo;

import jakarta.persistence.EntityManager;
import jakarta.persistence.ParameterMode;
import jakarta.persistence.StoredProcedureQuery;


@Service
public class StockInfoMgmtServiceImp implements IStockInfoMgmtService {

/*	CREATE DEFINER=`root`@`localhost` PROCEDURE `p_get_stocks_by_price_range`(in start float,
            in end float)
BEGIN
select * from stock_info where stock_price>=start and stock_price<=end;
END*/
	
	@Autowired
	private EntityManager manager;
	
	@Override
	public List<StockInfo> getStocksByPriceRange(double start, double end) {
		//create stored procedurequery object
		StoredProcedureQuery query=manager.createStoredProcedureQuery("p_get_stocks_by_price_range", StockInfo.class);
		
		//register the parameter of stored procedure
		query.registerStoredProcedureParameter(1, Double.class, ParameterMode.IN);
		query.registerStoredProcedureParameter(2, Double.class, ParameterMode.IN);
		
		//set parameter values
		query.setParameter(1, start);
		query.setParameter(2, end);
		
		//call pl/sql procedure
		@SuppressWarnings("unchecked")
		List<StockInfo> list=query.getResultList();
		
		return list;
	}

}
