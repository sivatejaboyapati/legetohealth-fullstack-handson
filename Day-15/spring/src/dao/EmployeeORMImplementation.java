package com.org.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeORMImpl implements EmployeeDao {

	public EmployeeORMImpl() {
		System.out.println("Employee ORMImplementation");
	}

	@Override
	public void store() {
		System.out.println("store method from EmployeeORM");

	}

	@Override
	public void delete() {
		System.out.println("delete method from EmployeeORM");

	}

}
