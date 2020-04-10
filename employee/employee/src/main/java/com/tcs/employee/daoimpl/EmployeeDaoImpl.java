package com.tcs.employee.daoimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.tcs.employee.Employee;
import com.tcs.employee.dao.EmployeeDao;


@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	@Autowired
	JdbcTemplate empjdbctemplate;
	public Employee findById(long empid)
	{
		return empjdbctemplate.queryForObject("select * from EMPLOYEE where id=?", new Object[] {
	            empid},new BeanPropertyRowMapper < Employee > (Employee.class));
	}
	public ResponseEntity<List<Employee>> getAll()
	{
	 
	 return new ResponseEntity<List<Employee>>(empjdbctemplate.query(
				"SELECT * FROM EMPLOYEE",
                new BeanPropertyRowMapper(Employee.class)),HttpStatus.OK);
		 
	}
	public int insertEmployee(Employee emp) 
	{
		return empjdbctemplate.update("insert into EMPLOYEE(id,name,address) values(?,?,?)",new Object[] {emp.getId(),emp.getName(),emp.getAddress()});
	}
	public int deleteEmp(long id)
	{
		String SQL = "delete from EMPLOYEE where id = ?";
	      return empjdbctemplate.update(SQL, id);
	}
	public int updateEmployee(Employee emp){
        String sql = "update EMPLOYEE set name = ? where id = ?";
        return empjdbctemplate.update(sql,new Object[]{emp.getName(),emp.getId()});
    }
}
