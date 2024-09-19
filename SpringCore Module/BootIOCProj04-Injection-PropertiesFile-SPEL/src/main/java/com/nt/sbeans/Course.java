package com.nt.sbeans;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("course")//to make it speingBean
@Data//to use lombok api 
public class Course {
//injecting values from properties file
@Value("${java.fee}")	
private int javaFee;
@Value("${python.fee}")
private int pythonFee;
@Value("${andriod.fee}")
private int androidFee;
@Value("${UI.fee}")
private int UIFee; 

}
