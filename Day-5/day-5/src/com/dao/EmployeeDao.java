package com.dao;

import java.util.List;

import com.beans.Employee;
import com.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	public int store(Employee employee);
	public Employee findById(int id) throws EmployeeNotFoundException;
	public List<Employee> findAll();
	public void delete(int id) throws EmployeeNotFoundException;
	public void update(int id, double salary) throws EmployeeNotFoundException;
}
