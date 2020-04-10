package com.example.demo.customer.datalayer.impl;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.demo.customer.customer;

public interface custdataimpl {
	public ResponseEntity<List<customer>> getalldao();
	public ResponseEntity<customer> byiddao(int x);

}
