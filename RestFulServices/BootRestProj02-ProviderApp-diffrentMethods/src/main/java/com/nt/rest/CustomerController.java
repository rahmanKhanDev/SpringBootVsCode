package com.nt.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")//global path
public class CustomerController {

// get method
	@GetMapping("/report")
	public ResponseEntity<String> getCustomer(){
		System.out.println("CustomerController.getCustomer()");
		return new ResponseEntity<String>("Customer retreived sucessfully", HttpStatus.OK);
	}
	
	//post method
	@PostMapping("/register")
	public ResponseEntity<String> registerCustomer(){
		System.out.println("CustomerController.registerCustomer()");
		return new ResponseEntity<String>("Customer registred succsessfully",HttpStatus.CREATED);
	}
	
	//put method
	@PutMapping("/modify")
	public ResponseEntity<String> updateCustomer(){
		System.out.println("CustomerController.updateCustomer()");
		return new ResponseEntity<String> ("Customer updated successfully",HttpStatus.OK);
	}
	
	//patch method
	@PatchMapping("/pmodify")
	public ResponseEntity<String> emailUpdate(){
		System.out.println("CustomerController.emailUpdate()");
		return new ResponseEntity<String>("Emial updated successfully", HttpStatus.OK);
	}
	//delete method
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteCustomer(){
		System.out.println("CustomerController.deleteCustomer()");
		return new ResponseEntity<String>("Customer deleted sucessfully",HttpStatus.OK);
	}
}
