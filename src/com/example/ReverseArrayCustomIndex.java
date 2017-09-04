package com.example;

public class ReverseArrayCustomIndex {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] reversedArr = arrToReverseSwap(arr, 5);
		for (int i = 0; i < reversedArr.length; i++) {
			System.out.println(reversedArr[i]);
		}
	}

	@SuppressWarnings("unused") //Not Recommended
	private static int[] arrToReverse(int[] arr, int n) {
		int[] tempArr = new int[arr.length];
		System.arraycopy(arr, 0, tempArr, 0, arr.length);
		for (int i = n - 1, j = 0; i >= 0; i--, j++) {
			tempArr[j] = arr[i];
		}
		return tempArr;
	}
	
	private static int[] arrToReverseSwap(int[] arr, int n) {
		for (int i = 0; i < n/2; i++)
	        swap(arr,i, n-i-1);
		return arr;
	}
	
	private static void swap(int[] arr, int i, int j){
		if(i==j)
			return;
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}