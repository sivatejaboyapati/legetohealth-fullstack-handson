package day1;

import java.util.Scanner;

public class SumofBandS {
	/*
	 * static void method(int i, int j, int k) { int big,small;
	 * 
	 * if(i>j&&i>k) { big=i; } else if(j>i&&j>k) { big=j; } else { big=k; }
	 * if(i<j&&i<k) { small=i; } else if(j<i&&j<k) { small=j; } else { small=k; }
	 * System.out.println(big+small);
	 * 
	 * 
	 * }
	 */
	//int arr1[]=new int[3];
	static void method(int[] arr) {
		int big=arr[1],small=arr[1];
		for(int i=1;i<4;i++) {
			if(arr[i]>big) {
				big=arr[i];
			}
		}
		for(int i=1;i<4;i++) {
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println(big+small);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		System.out.println("Enter the 3 numbers");
		for(int i=1;i<4;i++) {
			arr[i]=sc.nextInt();
		}
		method(arr);
		/*
		 * int i=sc.nextInt(); int j=sc.nextInt(); int k=sc.nextInt(); method(i,j,k);
		 */
	}

}
