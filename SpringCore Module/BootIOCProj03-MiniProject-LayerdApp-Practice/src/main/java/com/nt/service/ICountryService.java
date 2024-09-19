package com.nt.service;

import java.util.List;

import com.nt.model.Country;

public interface ICountryService {
public List<Country> getCountryByName(String name1,String name2,String name3)throws Exception;
}
