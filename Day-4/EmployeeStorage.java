package day4;

public interface EmployeeStorage {
	public int save(Employee e);
	public Employee findEmployee(int eid) throws EmployeeNotFoundException;
	public Employee[] findEmployees();
	public void delete(int id) throws EmployeeNotFoundException;

}
