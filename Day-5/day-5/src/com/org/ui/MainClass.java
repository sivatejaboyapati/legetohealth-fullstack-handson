package com.org.ui;

import java.util.*;
import com.beans.Employee;
import com.dao.EmployeeDao;
import com.exception.EmployeeNotFoundException;
import com.factory.ObjectFact;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		EmployeeDao dao = ObjectFact.getInstance();
		do {
			System.out.println("1: Store Employee, 2: Fetch all Employees");
			System.out.println("3: Fetch Employee, 4: Delete Employee by id");
			System.out.println("5: Update Employee salary by id, 6: Exit");
			option = scan.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter Name");
				String name = scan.next();
				System.out.println("Enter Salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee(0, name, salary);
				int status = dao.store(employee);
				if (status == -1) {
					System.err.println("Employee not stored");
				} else {
					System.out.println("Employee stored successfully");
				}
				break;
			case 2:
				List<Employee> employeesList = new ArrayList<Employee>();
				employeesList = dao.findAll();
				for (Employee emp : employeesList)
					System.out.println(emp);
				break;
			case 3:
				System.out.println("Enter id");
				int id = scan.nextInt();
				try {
					employee = dao.findById(id);
					System.out.println(employee);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error: " + e.getMessage());
				}
				break;
			case 4:
				System.out.println("Enter id to delete");
				int did = scan.nextInt();
				try {
					dao.delete(did);
				} catch (EmployeeNotFoundException e1) {
					e1.printStackTrace();
				}

				break;
			case 5:
				System.out.println("Enter id");
				int eid = scan.nextInt();
				System.out.println("Enter salary to Update");
				double esalary = scan.nextDouble();
				try {
					dao.update(eid, esalary);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error : " + e.getMessage());
				}
				break;
			case 6:
				System.out.println("Exited");
				break;
			default:
				System.out.println("wrong input");
			}

		} while (option != 6);

		scan.close();
	}

}
