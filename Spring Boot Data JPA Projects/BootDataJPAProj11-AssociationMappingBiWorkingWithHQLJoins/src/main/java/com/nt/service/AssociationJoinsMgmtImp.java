package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.repository.IPersonRepository;
import com.nt.repository.IPhoneNumberRepository;

@Service
public class AssociationJoinsMgmtImp implements IAssociastionJoinsMgmt {
	@Autowired
	private IPersonRepository personRepo;
	@Autowired
	private IPhoneNumberRepository phoneRepo;

	@Override
	public List<Object[]> fetchDataUsingJionsWithparent() {
		List<Object[]> obj=personRepo.getDataUsingJoinsByParent();
		return obj;
	}

	@Override
	public List<Object[]> fetchDataUsingJoinsWithChild() {
		
		return phoneRepo.getDataUsingJoinByChild();
	}

}
