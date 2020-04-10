package com.example.demo.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.customer.customer;
import com.example.demo.customer.service.custservice;

@RestController
public class custcontroller {
	@Autowired
	custservice c;
	@GetMapping(value="/all")
	public ResponseEntity<List<customer>> getAllCust() {
		return c.getall();
		
	}
	@GetMapping(path="/{x}")
	public ResponseEntity<customer> byid(@PathVariable("x") int x)
	{
		return c.byid(x);
		
		
	}
	
	
	

}
