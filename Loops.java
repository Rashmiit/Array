package com.achiever.first;
import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a no.");
		 long num=scanner.nextLong();
		 int count=0;
		 int sum=0;
		 while(num!=0) {
			 sum+=num%10;
			 num=num/10;
			 count++;
		 }
//		 scanner.close();
		 System.out.println("total"+"="+count);
		 System.out.println("sum"+"="+sum);

		 scanner.close();
		 
		
		
		
//		for(int i=1;i<=10;i++) {
//			
//			System.out.println(i+"*2025" +"="+(i*2025));
//		}

	}

}
