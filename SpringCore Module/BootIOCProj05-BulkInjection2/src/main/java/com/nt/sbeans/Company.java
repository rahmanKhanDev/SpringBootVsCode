package com.nt.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Component("comp")
@Data
@ConfigurationProperties(prefix="org.nt")
public class Company {
private int id;
private String name;
@Value("${org.nt.add}")
private String add;
private int pincode;
private long contact;


private Map<String,Integer> branchDetail;


}
