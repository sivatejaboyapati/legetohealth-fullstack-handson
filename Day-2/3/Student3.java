package day2;

public class Student3 {
	int studentId;
	String studentName;
	String city;
	int marks1,marks2,marks3;
	float feePerMonth;
	boolean isEligibleForScholarship;
	public Student3(int studentId,String studentName, String city, int marks1, int marks2, int marks3, float feePerMonth, boolean isEligibleForScholarship) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.city=city;
		this.marks1=marks1;
		this.marks2=marks2;
		this.marks3=marks3;
		this.feePerMonth=feePerMonth;
		this.isEligibleForScholarship=isEligibleForScholarship;
		
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getMarks1() {
		return marks1;
	}
	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}
	public int getMarks2() {
		return marks2;
	}
	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}
	public int getMarks3() {
		return marks3;
	}
	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	public float getFeePerMonth() {
		return feePerMonth;
	}
	public void setFeePerMonth(float feePerMonth) {
		this.feePerMonth = feePerMonth;
	}
	public boolean isEligibleForScholarship() {
		return isEligibleForScholarship;
	}
	public void setEligibleForScholarship(boolean isEligibleForScholarship) {
		this.isEligibleForScholarship = isEligibleForScholarship;
	}
	public void getAnualFee(){
		System.out.println("Fee Per Month:"+feePerMonth);
		float annual=(12*feePerMonth);
		System.out.println("Annual Fee:"+feePerMonth);
	}
	public void getTotalmarks() {
		int sum=marks1+marks2+marks3;
		System.out.println("Total Marks:"+sum);
	}
	public void getAverage() {
		int sum=marks1+marks2+marks3;
		int avg=sum/3;
		System.out.println("Average:"+avg);
	}
	public void getResult() {
		if(marks1>60&&marks2>60&&marks3>60) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	
}
