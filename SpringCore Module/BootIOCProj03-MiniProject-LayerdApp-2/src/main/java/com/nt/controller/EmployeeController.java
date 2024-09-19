package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMngmtService;

@Controller("empController")
public class EmployeeController {

	//injecting service class object
	@Autowired
	private IEmployeeMngmtService serviceObj;
	public List<Employee> getEmployeeBydesgns(String desg1,String desg2,String desg3) throws Exception{
		//invoking service class method
		List<Employee> list=serviceObj.getAllEmployeeByDesgns(desg1, desg2, desg3);
		return list;
		
	}
}
