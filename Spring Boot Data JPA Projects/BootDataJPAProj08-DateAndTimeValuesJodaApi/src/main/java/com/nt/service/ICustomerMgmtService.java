package com.nt.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

public interface ICustomerMgmtService {
	public String saveCustomer(Customer customer);

   public float getAllCustomerAgesById(Integer id);
   
}
