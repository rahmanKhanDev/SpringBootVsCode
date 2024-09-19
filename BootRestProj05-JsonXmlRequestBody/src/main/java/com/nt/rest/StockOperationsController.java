package com.nt.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nt.model.StockInfo;

@RestController
@RequestMapping("/stock")// global path
public class StockOperationsController {

	// get request data
	@PostMapping("/register")
	public String registerStock(@RequestBody StockInfo info){
		// return StockInfo data 
		return  info.toString();
	}
}
