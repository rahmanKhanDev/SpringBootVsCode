package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("institute")
@Data
public class Institute {
@Value("101")//direct injecting simple values
private int InstId;
@Value("${inst.name}")//injecting from properties file
private String name;

//SPEL for arithmetic expression
@Value("#{course.javaFee+course.pythonFee+course.androidFee+course.UIFee}")
private long courseFee;
@Value("${inst.add}")
private String add;
@Value("${inst.contact}")
private long instContact;

//system properties
@Value("${os.name}")
private String osName;
@Value("${os.version}")
private String osVersion;

//system path
@Value("${path}")
private String path;
	
}
