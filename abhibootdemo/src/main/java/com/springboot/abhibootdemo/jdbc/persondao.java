package com.springboot.abhibootdemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.abhibootdemo.entity.Person;

@Repository
public class persondao {

	@Autowired
	JdbcTemplate jt;
	public persondao() {
		// TODO Auto-generated constructor stub
				
	}
	
	public List<Person> getinfo()
	{
		return jt.query("select * from person", new BeanPropertyRowMapper(Person.class));
		
	}

}
