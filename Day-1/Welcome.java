package day1;
import java.util.*;
public class Welcome {
	static void message(String name) {
		System.out.println("Hello "+name);
		System.out.println("Welcome to Java");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("Hello");
		String name=sc.nextLine();
		message(name);
		
	}

}
