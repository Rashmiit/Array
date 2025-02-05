package com.achiever.first;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no.");
		int total = scanner.nextInt();

		if (total >= 5000) {
			double total1 = total * 2;
			double total2 = total - total1;
			System.out.println("discount" + " " + total1);
			System.out.println("balance" + " " + total2);

		} else {
			System.out.println("no discount");
		}

		int arr[] = { 100, 200, 32, 9 };
		System.out.println(Arrays.binarySearch(arr, 32));
		scanner.close();
	}
}
