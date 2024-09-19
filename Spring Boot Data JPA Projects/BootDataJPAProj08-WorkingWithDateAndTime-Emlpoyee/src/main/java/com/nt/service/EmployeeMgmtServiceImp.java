package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImp implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository empRepo;

	@Override
	public String registerEmployee(Employee emp) {
		
	int id=	empRepo.saveAndFlush(emp).getEId();
		return "Employee is registered succsessfully with employee id::"+id;
	}

	@Override
	public float showAgeOfEmployeeById(int id) {
	   float age= empRepo.getEmployeeAgeById(id);
		return age;
	}

}
