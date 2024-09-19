package com.nt.rest;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.Company;
import com.nt.model.Customer;

@RestController
@RequestMapping("/customer-api")
public class CustomerOperatonsController {
	
	// sending complex data
	@GetMapping("/report")
	public ResponseEntity<Customer> getCustomer() {
		
		Company company=new Company("Samsung","Hyd","Electronics",65000);
		return new ResponseEntity<Customer>(
				new Customer(1001, "Tanzil Ahmed", "Hyderabad", 
						new String[] { "Black", "White", "Green", "Off White" },
						Set.of(6666666L, 7777777L, 8888888L),
						List.of("10th", "10+2", "B.E"), 
						Map.of("Adhar Id",5555555L, "Voter Id", 3434343L, "Passport No", 7643425L, "Driving Id",987539L), company),
				HttpStatus.OK);
	}
	
	// sending only object
	@PostMapping("/report")
	public ResponseEntity<Company> getCompnay() {
	// company object
		Company c1=new Company("Samsung","Pune","Electronics",54000);
		return new ResponseEntity<Company>(c1,HttpStatus.OK);
  		  
	}
	
}
