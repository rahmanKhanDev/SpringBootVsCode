package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.PhoneNumber;

public interface IPhoneNumberRepository extends JpaRepository<PhoneNumber, Integer> {
	@Query(" select ph.regNo,ph.number,ph.provider,p.pId,p.pName,p.pAdd from PhoneNumber ph inner join ph.personInfo p")
public List<Object[]> getDataUsingJoinByChild();
	
}
