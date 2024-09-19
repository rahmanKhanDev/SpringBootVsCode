package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("cust")
@ConfigurationProperties(prefix="cust.info")
public class Customer {

	private String nickNames[];
}
