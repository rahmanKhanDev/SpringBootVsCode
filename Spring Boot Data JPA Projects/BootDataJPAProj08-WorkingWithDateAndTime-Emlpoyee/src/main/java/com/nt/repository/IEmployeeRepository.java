package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Employee;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "SELECT DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(),dob)),'%y') FROM Employee_Info_Joda_Api WHERE E_ID=?1 ",nativeQuery = true)
	
	public Float getEmployeeAgeById(Integer id);
}
