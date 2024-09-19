package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("my")
@Data
@ConfigurationProperties(prefix="my.info")
public class MyClass {
private int id;
private String name;
private String add;
private long contact;
}
