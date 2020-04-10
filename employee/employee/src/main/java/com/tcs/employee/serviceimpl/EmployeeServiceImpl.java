package com.tcs.employee.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import org.springframework.stereotype.Service;

import com.tcs.employee.Employee;
import com.tcs.employee.dao.EmployeeDao;
import com.tcs.employee.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService
{

@Autowired
EmployeeDao empdao;
public Employee getById(long empid)
{
	return empdao.findById(empid);
}
public List<Employee> getAll()
{
	return empdao.getAll();	
}
public int insertEmp(Employee emp)
{
	return empdao.insertEmployee(emp);
}
public int deleteEmp(long id)
{
	return empdao.deleteEmp(id);
}
public int updateEmployee(Employee emp)
{
	return empdao.updateEmployee(emp);
}
}
