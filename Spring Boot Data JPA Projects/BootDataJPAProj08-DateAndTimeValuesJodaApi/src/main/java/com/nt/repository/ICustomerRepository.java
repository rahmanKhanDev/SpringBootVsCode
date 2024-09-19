package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
	@Query(value = "Select DATE_FORMAT(FROM_DAYS(DATEDIFF(NOW(),dob)),'%y') from Customer_Info_JPA_JODA where c_id=?1", nativeQuery = true)
	public float getAllCustomerAgeById(Integer id);
}
