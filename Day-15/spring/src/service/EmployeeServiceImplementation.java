package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.org.dao.EmployeeDao;

@Service
public class EmployeeServiceImpl {
	private EmployeeDao dao;

	@Autowired
	public EmployeeServiceImpl(@Qualifier(value = "employeeJdbcImpl") EmployeeDao dao) {
		this.dao = dao;
		System.out.println("EmployeeServiceImplementation");
	}


	public void save() {
		System.out.println("save method from EmployeeService");
		dao.store();
	}

	public void remove() {
		System.out.println("remove method from EmployeeService");
		dao.delete();
	}
}
