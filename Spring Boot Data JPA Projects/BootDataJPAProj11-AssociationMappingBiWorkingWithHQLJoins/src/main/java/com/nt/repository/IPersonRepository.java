package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.nt.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> {

	@Query("select p.pId,p.pName,p.pAdd,ph.regNo,ph.number,ph.provider from Person p inner join p.phoneNumbers ph")

//	@Query("select p.pId,p.pName,p.pAdd,ph.regNo,ph.number,ph.provider from Person p right join p.phoneNumbers ph")
//	@Query("select p.pId,p.pName,p.pAdd,ph.regNo,ph.number,ph.provider from Person p left join p.phoneNumbers ph")
	public List<Object[]> getDataUsingJoinsByParent();

}
