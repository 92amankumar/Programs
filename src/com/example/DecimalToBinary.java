package com.example;

import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		System.out.println("Enter a positive number:");
		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			while (number < 0) {
				System.out.println("Not a positive number. Please enter again:");
				number = scanner.nextInt();
			}
			convertBinary(number);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void convertBinary(int num) {
		int binary[] = new int[40];
		int index = 0;
		while (num > 0) {
			binary[index++] = num % 2;
			num = num / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}
	}
}
