package com.nt.service;

import java.util.Optional;

import com.nt.entity.MarriageSeeker;

public interface IMarriageSeekerServiceMgmt {
public String registerMarraigeSeeker(MarriageSeeker seeker);
public Optional<MarriageSeeker> getMarraigeSeekerById(Integer sId);
}
