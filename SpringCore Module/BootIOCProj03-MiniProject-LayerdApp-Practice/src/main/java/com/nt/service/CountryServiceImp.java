package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.ICountryDao;
import com.nt.model.Country;

@Service("service")
public class CountryServiceImp implements ICountryService {

    @Autowired
	private ICountryDao countryDao;
	@Override
	public List<Country> getCountryByName(String name1, String name2, String name3) throws Exception {
	List<Country>	list=countryDao.showCountryByNames(name1, name2, name3);
		return list;
	}

}
