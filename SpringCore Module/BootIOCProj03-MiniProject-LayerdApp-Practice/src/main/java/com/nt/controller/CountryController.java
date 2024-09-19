package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Country;
import com.nt.service.ICountryService;

@Controller("controller")
public class CountryController {

	@Autowired
	private ICountryService serviceObj;
	public List<Country> getAllCountryByName(String name1,String name2,String name3)throws Exception{
	List<Country>	list=serviceObj.getCountryByName(name1, name2, name3);
		return list;
		
	}
}
