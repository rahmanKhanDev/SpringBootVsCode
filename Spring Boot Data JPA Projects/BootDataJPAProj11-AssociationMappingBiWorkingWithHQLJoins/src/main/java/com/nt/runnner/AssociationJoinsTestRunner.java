package com.nt.runnner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IAssociastionJoinsMgmt;

@Component
public class AssociationJoinsTestRunner implements CommandLineRunner {
	@Autowired
	private IAssociastionJoinsMgmt service;

	@Override
	public void run(String... args) throws Exception {
		
//	List<Object[]> objects=service.fetchDataUsingJionsWithparent();
//	System.out.println("pId, pName, pAdd, regNo, number, provider");
//	objects.forEach(row->{
//		for(Object var:row) {
//			System.out.print(var+",");
//		}
//		System.out.println();
//	});
	
	List<Object[]> obj=service.fetchDataUsingJoinsWithChild();
	obj.forEach(row->{
	System.out.println(	Arrays.toString(row));
	});
	
	

	}

}
