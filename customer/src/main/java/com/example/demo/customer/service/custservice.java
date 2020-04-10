package com.example.demo.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.customer.customer;
import com.example.demo.customer.datalayer.custdata;
import com.example.demo.customer.service.impl.custserviceimpl;
@Service
public class custservice implements custserviceimpl {
	
	@Autowired
	custdata a;
	
	
	public ResponseEntity<List<customer>> getall(){
		
		return a.getalldao();
		
		
	}
	public ResponseEntity<customer> byid(int x) {
		return a.byiddao(x);
		
	}

}
