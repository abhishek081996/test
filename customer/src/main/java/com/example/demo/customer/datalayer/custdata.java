package com.example.demo.customer.datalayer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.customer.customer;
import com.example.demo.customer.datalayer.impl.custdataimpl;

@Repository
public class custdata implements custdataimpl {

	@Autowired
	JdbcTemplate jd;
	@Override
	public ResponseEntity<List<customer>> getalldao() {
		String sql="select * from customer";
		return new ResponseEntity<List<customer>>(jd.query(sql, new BeanPropertyRowMapper<customer>(customer.class)),HttpStatus.OK);
	
	}

	@Override
	public ResponseEntity<customer> byiddao(int x) {
		String sql="select * from customer where id="+x;
		System.out.println(sql);
		return new ResponseEntity<customer> ((customer) jd.queryForObject(sql, new BeanPropertyRowMapper<customer>(customer.class)),HttpStatus.OK);
	}
	

}
