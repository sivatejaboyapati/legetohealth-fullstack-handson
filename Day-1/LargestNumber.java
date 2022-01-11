package day1;
import java.util.*;

public class LargestNumber {
	static void method(int i,int j,int k) {
		if(i>j&&i>k) {
			System.out.println(i);
		}
		else if(j>i&&j>k) {
			System.out.println(j);
		}
		else {
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 numbers");
		int i=sc.nextInt();
		int j=sc.nextInt();
		int k=sc.nextInt();
		method(i,j,k);
	}

}
