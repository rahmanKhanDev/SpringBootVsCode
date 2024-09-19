package com.nt.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

	private Integer cid;
	private String name;
	private String add;
	private String[] favColors;
	private Set<Long> phones;
	private List<String> degreeList;
	private Map<String, Long> govId;
	
	// HAS-A property
	private Company company;
	
}
