package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Country;

@Repository("dao")
public class CountryDaoImp implements ICountryDao {

	private final String GET_COUNTRY__BY_NAME="SELECT CODE,NAME,LANGUAGE,CURRENCY,POPULATION FROM COUNTRY WHERE NAME IN(?,?,?) ORDER BY CODE";
	@Autowired
	private DataSource ds;
	List<Country> list=new ArrayList<>();
	@Override
	public List<Country> showCountryByNames(String name1, String name2, String name3) throws Exception {
		Connection con=ds.getConnection();
		PreparedStatement pstmt=con.prepareStatement(GET_COUNTRY__BY_NAME);
		pstmt.setString(1, name1);
		pstmt.setString(2, name2);
		pstmt.setString(3, name3);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			Country country=new Country();
			country.setCode(rs.getInt(1));
			country.setName(rs.getString(2));
			country.setLanguage(rs.getString(3));
			country.setCurrency(rs.getString(4));
			country.setPopulation(rs.getInt(5));
			list.add(country);
		}
		return list;
	}

}
