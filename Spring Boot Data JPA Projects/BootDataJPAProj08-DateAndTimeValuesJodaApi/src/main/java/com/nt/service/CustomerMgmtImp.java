package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.repository.ICustomerRepository;

@Service
public class CustomerMgmtImp implements ICustomerMgmtService {

	@Autowired
	private ICustomerRepository customerRepo;

	@Override
	public String saveCustomer(Customer customer) {
		int id = customerRepo.save(customer).getCId();
		return "Customer registered succssfully with customer id::"+id;
	}

	@Override
	public float getAllCustomerAgesById(Integer id) {
		
		return customerRepo.getAllCustomerAgeById(id);
	}

	

}
