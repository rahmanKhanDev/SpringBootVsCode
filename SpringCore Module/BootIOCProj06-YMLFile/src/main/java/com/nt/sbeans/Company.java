package com.nt.sbeans;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp")
@ConfigurationProperties(prefix="com.nt")
@Data
public class Company {
private int id;
private String name;
private String add;
private Long contact;
private List<String> branch; 
}
