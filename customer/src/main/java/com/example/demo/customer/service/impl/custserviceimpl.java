package com.example.demo.customer.service.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.customer.customer;

public interface custserviceimpl {

	public ResponseEntity<List<customer>> getall();
	public ResponseEntity<customer> byid(int x);
	
}
