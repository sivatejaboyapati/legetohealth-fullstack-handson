package com.org.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.EmployeeServiceImpl;

public class TestViewController {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeServiceImplementation service = (EmployeeServiceImplementation) context.getBean("employeeService");
		service.save();
		ClassPathXmlApplicationContext cpx = (ClassPathXmlApplicationContext) context;
		cpx.close();
	}

}
