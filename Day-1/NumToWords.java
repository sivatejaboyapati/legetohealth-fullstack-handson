package day1;
import java.util.*;
public class NumToWords {
static void method(char n) {
	switch(n) {
	case '0':
		System.out.print("Zero");
		break;
	case '1':
		System.out.println("One");
		break;
	case '2':
		System.out.println("Two");
		break;
	case '3':
		System.out.println("Three");
		break;
	case '4':
		System.out.println("Four");
		break;
	case '5':
		System.out.println("Five");
		break;
	case '6':
		System.out.println("Six");
		break;
	case '7':
		System.out.println("Seven");
		break;
	case '8':
		System.out.println("Eight");
		break;
	case '9':
		System.out.println("Nine");
		break;	
	}
	
}
static void NumToWord(String n) {
	int i,j=n.length();
	for(i=0;i<j;i++) {
		method(n.charAt(i));
	}
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String n=sc.nextLine();
	NumToWord(n);
	
}
}
