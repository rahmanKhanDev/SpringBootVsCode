package com.nt.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class EmployeeJodaApiTestRunner implements CommandLineRunner {
	@Autowired
	private IEmployeeMgmtService empService;

	@Override
	public void run(String... args) throws Exception {
//		Employee emp = new Employee("Sonu Khan", LocalDateTime.of(2000, 3, 1, 18, 15), "Hyderabad",
//				LocalDate.of(2024, 4, 10), LocalTime.of(13, 45), 55000.89);
//		String msg = empService.registerEmployee(emp);
		float age=empService.showAgeOfEmployeeById(1);
		System.out.println("Employee age is::"+age);
	}

}
