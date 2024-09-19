package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class BootRestProj11ConsumerAppExchangeMethodApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootRestProj11ConsumerAppExchangeMethodApplication.class, args);
	}

	@Bean
	public RestTemplate createTemplate() {
		return new RestTemplate();
	}

}
