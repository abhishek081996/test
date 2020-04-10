package com.tcs.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.tcs.employee.Employee;
import com.tcs.employee.service.EmployeeService;

@RestController
@RequestMapping(value="/employee")

public class EmployeeController
{
	@Autowired
	 EmployeeService empservice;
	@GetMapping(value="/{empid}")
	public Employee getEmployee(@PathVariable("empid") long empid)
	{
		return empservice.getById(empid);
	}
	@GetMapping(value="/all")
	public List<Employee> findAll()
	{
		return empservice.getAll();
	}
	@PostMapping(value="/")
	public int insertEmp(@RequestBody Employee emp)
	{
		return empservice.insertEmp(emp);
	}
	
	@DeleteMapping(value="/{empid}")
	public int deleteEmp(@PathVariable("empid") long empid)
	{
		return empservice.deleteEmp(empid);
	}
	
	@PutMapping(value="/")
	public int updateEmployee(@RequestBody Employee emp)
	{
		return empservice.updateEmployee(emp);
	}
	
	
}
