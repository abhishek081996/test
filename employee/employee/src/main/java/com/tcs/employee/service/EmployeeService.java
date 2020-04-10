package com.tcs.employee.service;

import com.tcs.employee.Employee;
import java.util.List;

public interface EmployeeService 
{
	public Employee getById(long empid);
	public List<Employee> getAll();
	public int insertEmp(Employee emp);
	public int deleteEmp(long empid);
	public int updateEmployee(Employee emp);
	 }
