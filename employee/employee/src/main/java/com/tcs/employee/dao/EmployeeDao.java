package com.tcs.employee.dao;

import com.tcs.employee.Employee;

import java.util.List;

import org.springframework.http.ResponseEntity;

public interface EmployeeDao 
{
	public Employee findById(long empid);
	public ResponseEntity<List<Employee>> getAll();
	public int insertEmployee(Employee emp);
	public int deleteEmp(long empid);
	public int updateEmployee(Employee emp);
	 
}
s