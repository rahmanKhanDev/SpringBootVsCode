package com.nt.service;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {

	public String registerEmployee(Employee emp);
	public float showAgeOfEmployeeById(int id);
}
