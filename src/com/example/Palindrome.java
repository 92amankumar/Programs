package com.example;

public class Palindrome {
	public static void main(String[] args) {
		String str = "SSTSS";
		System.out.println(new Palindrome().isPalindrome(str));
	}
	
	public boolean isPalindrome(String str){
		if(str.equalsIgnoreCase(new ReverseString().reverse(str)))
				return true;
		return false;
	}
	
	public boolean istPalindrom(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
}
