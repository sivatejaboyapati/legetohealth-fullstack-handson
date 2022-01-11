package day2;

public class TestStudent3 {
	public static void main(String[] args) {
		Student3 s1=new Student3(101,"kin","france",65,80,90,(float) 500.0,true);
		Student3 s2=new Student3(102,"fin","tokyo",55,70,93,(float) 700.0,false);
		Student3 s3=new Student3(103,"win","paris",90,85,95,(float) 400.0,true);
		int t1=s1.marks1+s1.marks2+s1.marks3;
		int t2=s2.marks1+s2.marks2+s2.marks3;
		int t3=s3.marks1+s3.marks2+s3.marks3;
		if(t1>t2&&t1>t3) {
			System.out.println("Highest Total Marks for Student:"+s1.studentName);
		}
		else if(t2>t3&&t2>t1) {
			System.out.println("Highest Total Marks for Student:"+s2.studentName);
		}
		else {
			System.out.println("Highest Total Marks for Student:"+s3.studentName);
		}
		if(s1.feePerMonth<s2.feePerMonth&&s1.feePerMonth<s3.feePerMonth) {
			System.out.println("Student who pays lowest monthly Fee Name:"+s1.studentName+"Fee:"+s1.feePerMonth);
		}
		else if(s2.feePerMonth<s1.feePerMonth&&s2.feePerMonth<s3.feePerMonth) {
			System.out.println("Student who pays lowest monthly Fee Name:"+s2.studentName+"Fee:"+s2.feePerMonth);
		}
		else {
			System.out.println("Student who pays lowest monthly Fee Name:"+s3.studentName+"Fee:"+s3.feePerMonth);
		}
		System.out.println(s1.studentName);
		s1.getTotalmarks();
		s1.getAverage();
		s1.getResult();
		System.out.println("Scholarship Elgibility:"+s1.isEligibleForScholarship);
		System.out.println(s2.studentName);
		s2.getTotalmarks();
		s2.getAverage();
		s2.getResult();
		System.out.println("Scholarship Elgibility:"+s2.isEligibleForScholarship);
		System.out.println(s3.studentName);
		s3.getTotalmarks();
		s3.getAverage();
		s3.getResult();
		System.out.println("Scholarship Elgibility:"+s3.isEligibleForScholarship);
		
	}
}
