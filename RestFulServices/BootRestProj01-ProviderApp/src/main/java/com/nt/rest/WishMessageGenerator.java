package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wish-app") // global path
public class WishMessageGenerator {

	// handler method/end point
	@GetMapping("/wish")
	public ResponseEntity<String> showWishMessage(){
         //return ResponeEntity obj
		return new ResponseEntity<String> ("Good morning", HttpStatus.OK);
}
}