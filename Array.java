package com.achiever.first;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arry[] = { 1, 2, 2 };
//		System.out.println(arry[0]);
		Scanner scanner=new Scanner(System.in);
		int total=0;
		System.out.println("Enter the no.");
		int size=scanner.nextInt();
		int marks[]=new int[size];
		System.out.println("enter"+" "+size+" "+"subject marks");
		scanner.close();

		for(int i=0;i<marks.length;i++) {
			marks[i]=scanner.nextInt();
//			System.out.println(marks[i]);
		}

//		int number[]= {1,2,3,4};
		for(int mark:marks) {
//			if(marks<=100)
			total+=mark;
		}
		
		float avg=total/size;
				System.out.println("total marks"+"="+ total);
				System.out.println("Average marks"+"="+avg);

		

	}
	

}