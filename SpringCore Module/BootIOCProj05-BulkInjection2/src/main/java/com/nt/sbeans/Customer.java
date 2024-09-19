package com.nt.sbeans;

import java.util.List;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@ConfigurationProperties(prefix = "cust")
@Component("customer")
public class Customer {

	// Normal dta
	private int id;
	private String name;
	private String add;
	private long contact;
	
	
	//array/list/set type data
	private String nickNames[];
	private List<String> address;
	private Set<Integer> pincodes;

}
