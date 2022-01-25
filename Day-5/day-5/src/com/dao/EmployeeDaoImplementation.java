package com.dao;

import java.sql.*;
import java.util.*;

import com.beans.Employee;
import com.exception.EmployeeNotFoundException;
public class EmployeeDaoImplementation implements EmployeeDao {
	@Override
	public int store(Employee emp) {
		int status = -1;
		try {
			Connection con = DBUtil.getConnection();
			String query = "insert into employee(name, salary) values(?, ?)";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, emp.getName()); 
			ps.setDouble(2, emp.getSal()); 
			status = ps.executeUpdate();
			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	@Override
	public Employee findById(int empId) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection con = DBUtil.getConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, empId);
			ResultSet result = ps.executeQuery();
			while (result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
			}
			result.close();
			ps.close();
			con.close();
			if (employee == null) {
				throw new EmployeeNotFoundException("Sorry, " + empId + " not found");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() {
		List<Employee> employeesList = new ArrayList<Employee>();
		try {
			Connection con = DBUtil.getConnection();
			String query = "select id, name, salary from employee";
			Statement statement = con.createStatement();
			ResultSet resultset = statement.executeQuery(query);
			while (resultset.next()) {
				Employee employee = new Employee(resultset.getInt(1), resultset.getString(2), resultset.getDouble(3));
				employeesList.add(employee);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employeesList;
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		try {
			int status = -1;
			Connection con = DBUtil.getConnection();
			String query = "delete from employee  where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1, id);
			status = ps.executeUpdate();

			ps.close();
			con.close();
			if (status == 0) {
				throw new EmployeeNotFoundException("Employee with id=" + id + "Not present");
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int id, double salary) throws EmployeeNotFoundException {
		try {
			int status = -1;
			Connection con = DBUtil.getConnection();
			String query = "update employee set salary = ? where id = ?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setDouble(1, salary);
			ps.setInt(2, id);
			status = ps.executeUpdate();

			ps.close();
			con.close();
			if (status == 0) {
				throw new EmployeeNotFoundException("Employee with id=" + id + "Not present");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
