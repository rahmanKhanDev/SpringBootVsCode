package com.nt.runner;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.entity.Customer;
import com.nt.service.ICustomerMgmtService;

@Component
public class CustomerTestRunner implements CommandLineRunner {

	@Autowired
	private ICustomerMgmtService customerService; 
	
	@Override
	public void run(String... args) throws Exception {
//		Customer customer=new Customer("Monu Khan", "Gujrat", LocalDateTime.of(2005, 1, 15, 16, 42), LocalTime.of(18, 35));
//		String msg=customerService.saveCustomer(customer);
//		System.out.println(msg);
		
		System.out.println(customerService.getAllCustomerAgesById(1));

	}

}
