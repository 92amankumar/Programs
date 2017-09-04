package com.example;

import java.util.Scanner;

//0 1 1 2 3 5 8 13 21
public class Fibonacci {

	int n1 = 0, n2 = 1, n3 = 0;
	public static void main(String[] args) {
		System.out.println("Enter fibonacci series till:");
		try (Scanner scanner = new Scanner(System.in)) {
			int till = scanner.nextInt();
			System.out.print(0 + " " + 1);// printing 0 and 1
			new Fibonacci().fibonacciSeries(till-2);
			System.out.println();
			new Fibonacci().fibonacciSeriesLoop(till);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void fibonacciSeries(int till) {
		
		if (till > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fibonacciSeries(till - 1);
		}
	}

	private void fibonacciSeriesLoop(int till) {
		int n1 = 0, n2 = 1, n3 = 0;
		for (int i = 2; i < till; ++i)// loop starts from 2 because 0 and 1 are
										// already printed
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
