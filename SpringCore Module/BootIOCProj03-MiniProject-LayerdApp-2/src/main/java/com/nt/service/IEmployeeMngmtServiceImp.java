package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDao;
import com.nt.model.Employee;
//making service cum component class
@Service("empService")
public class IEmployeeMngmtServiceImp implements IEmployeeMngmtService {

    //	dependecy injection of EmployeeDao object
	@Autowired
	private IEmployeeDao empDao;
	@Override
	public List<Employee> getAllEmployeeByDesgns(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=empDao.showAllEmployeeByDesgs(desg1, desg2, desg3);
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSal()+emp.getSal()*0.4f);
			emp.setNetSalary(emp.getGrossSalary()-emp.getGrossSalary()*0.2f);
		});
		return list;
	}

}
