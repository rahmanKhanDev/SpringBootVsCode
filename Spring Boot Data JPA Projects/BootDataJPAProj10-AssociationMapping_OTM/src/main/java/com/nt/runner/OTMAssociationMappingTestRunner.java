package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Person;
import com.nt.service.IOTMAssociationMappingMgmtService;

@Component
public class OTMAssociationMappingTestRunner implements CommandLineRunner {

	@Autowired
	private IOTMAssociationMappingMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		 service.saveDataUsingParent();
		// service.saveDataUsingChild();
		// service.loadDataUsingParent();
		// service.loadDataUsingChild();
		
		//Person per=new Person(3,"Mintu", "Gujrat");
		//service.updateParentById(per);

		// service.deleteByparent(4);
		// service.deleteAllChildOfAParent(1);
		// service.addNewChildToAParent(1);

	}

}
