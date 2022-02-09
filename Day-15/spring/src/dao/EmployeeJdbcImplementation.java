package com.org.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeJdbcImpl implements EmployeeDao {
	public EmployeeJdbcImpl() {
		System.out.println("Employee implementation");
	}

	@Override
	public void store() {
		System.out.println("store method from EmpJdbcImpl");

	}

	@Override
	public void delete() {
		System.out.println("delete method from EmpJdbcImpl");

	}

}
