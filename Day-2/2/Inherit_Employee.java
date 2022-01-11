package day2;

public class Inherit_Employee extends Inherit_Person {
	private int employeeId;
	private double salary;
	public Inherit_Employee(int employeeId, String name, String gender, double salary) {
		super(name,gender);
		this.employeeId=employeeId;
		this.salary=salary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void display() {
		super.display();
		System.out.println("ID:"+employeeId);
		System.out.println("Salary:"+salary);
	}

}
