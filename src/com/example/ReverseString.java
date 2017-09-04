package com.example;

public class ReverseString {
	
	public String reverse(String str){
		char[] arr = str.toCharArray();
		int begin = 0;
		int end = arr.length-1;
		char temp;
		while(end>begin){
			temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp;
			end--;
			begin++;
		}
		return new String(arr);
	}
	public void reverseStringFromCharArr(char[] charArray) {
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[charArray.length-i-1]);
		}
	}
	
	public void reverseStringFromCharArrLoopUlta(char[] charArray) {
		for (int i = charArray.length-1; i>=0; i--) {
			System.out.println(charArray[i]);
		}
	}
	
}
