package com.example;

public class BinaryPalindrome {
	public static void main(String[] args) {
		int i = 33;
		System.out.println(Integer.toBinaryString(i));
		System.out.println(new Palindrome().isPalindrome(Integer.toBinaryString(i)));
	}
}
