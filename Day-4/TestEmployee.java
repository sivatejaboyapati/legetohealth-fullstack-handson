package day4;
import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		EmployeeStorage es=new EmployeeStorageImpl();
		Scanner sc=new Scanner(System.in);
		System.out.println("Select your option");
		int x;
		do {
			System.out.println("1.Store"+"\n"+ "2.find employee");
			System.out.println("3.find list of employees"+"\n"+"4.delete employee"+"\n"+"5.exit");
			x=sc.nextInt();
			int y=x;
			switch(y) {
			case 1:
				System.out.println("enter employee id");
				int id=sc.nextInt();
				System.out.println("enter employee name");
				String name=sc.next();
				System.out.println("enter employee salary");
				double sal=sc.nextDouble();
				Employee e=new Employee(id,name,sal);
				System.out.println(es.save(e));
				break;
			case 2:
				System.out.println("enter employee id");
				int eid=sc.nextInt();
				try {
					System.out.println(es.findEmployee(eid));
					
				}catch(EmployeeNotFoundException en) {
					System.out.println("User not found");
					en.printStackTrace();
				}
				break;
			case 3:
				Employee[]e1=new Employee[es.findEmployees().length];
				for(int i=0;i<e1.length;i++) {
					e1[i]=es.findEmployees()[i];
				}
				for(int i=0;i<e1.length;i++) {
					System.out.println(e1[i]);
				}
				break;	
			case 4:
				System.out.println("Enter id to delete");
				int empid=sc.nextInt();
				try {
					es.delete(empid);
				} catch(EmployeeNotFoundException ex) {
					ex.printStackTrace();
				}
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Wrong input");
			}
			
		}while(x!=5);

	}

}
