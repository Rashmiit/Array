package com.achiever.first;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int matrix[][]=new int[2][2];
//		matrix[0][0]=100;
//		matrix[0][1]=200;
//		matrix[1][0]=400;
//		matrix[1][1]=500;
//		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) {
//				System.out.print(matrix[i][j]+" ");
//			}
//			System.out.println();
// 
//		}
		Scanner scanner = new Scanner(System.in);
		int sales[] = new int[4];
		System.out.println("kindly");

		for (int i = 0; i < sales.length; i++) {
			sales[i] = scanner.nextInt();
		}
		int highestSale = 0;
		int highestMonth = 0;
		for (int i = 0; i < sales.length; i++) {
			if (highestSale < sales[i]) {
				highestSale = sales[i];
				highestMonth = i;
			}
		}
		System.out.println("highest sale" + highestSale);
		System.out.println(highestMonth);
		scanner.close();
	}

}
