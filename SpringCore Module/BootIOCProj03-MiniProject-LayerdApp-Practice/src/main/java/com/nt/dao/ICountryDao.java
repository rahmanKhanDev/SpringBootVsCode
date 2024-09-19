package com.nt.dao;

import java.util.List;

import com.nt.model.Country;

public interface ICountryDao {
public List<Country> showCountryByNames(String name1,String name2,String name3)throws Exception ;
}
