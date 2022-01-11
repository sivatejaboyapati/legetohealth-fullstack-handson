package day2;

public class Test {
	public static void main(String[] args) {
		Student s1=new Student(100,"bobby","male","a");
		print(s1);
		Customer c1=new Customer(819,"ram","male",911,31000);
		print(c1);
		Inherit_Employee e1=new Inherit_Employee(119,"usha","female",35000);
		print(e1);
		Inherit_Person p1=new Inherit_Person("alice","male");
		print(p1);
		
		
	}
	public static void print(Inherit_Person a1) {
		a1.display();
	}
}
