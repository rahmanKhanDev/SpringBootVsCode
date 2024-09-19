package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.MarriageSeeker;
import com.nt.repository.IMarraigeSeekerRepository;

@Service
public class MarraigeSeekerMgmtImp implements IMarriageSeekerServiceMgmt {

	@Autowired
	public IMarraigeSeekerRepository seekerRepo;

	@Override
	public String registerMarraigeSeeker(MarriageSeeker seeker) {
		int id = seekerRepo.save(seeker).getSId();
		return "Marraige Seeker registered successfully with seeker id::" + id;
	}

	@Override
	public Optional<MarriageSeeker> getMarraigeSeekerById(Integer sId) {

		return seekerRepo.findById(sId);
	}

}
