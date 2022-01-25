package com.factory;

import com.dao.EmployeeDao;
import com.dao.EmployeeDaoImplementation;

public class ObjectFact {
	public static EmployeeDao getInstance() {
		return new EmployeeDaoImplementation();
	}
}
