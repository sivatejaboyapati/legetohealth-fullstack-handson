package day2;

public class Student extends Inherit_Person {
	private int rollno;
	private String grade;
	public Student(int rollno,String name, String gender, String grade) {
		super(name,gender);
		this.rollno=rollno;
		this.grade=grade;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void display() {
		super.display();
		System.out.println("Roll No:"+rollno);
		System.out.println("Grade:"+grade);
	}


}
