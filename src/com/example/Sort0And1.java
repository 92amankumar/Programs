package com.example;

import java.util.Arrays;

public class Sort0And1 {
	public static void main(String[] args) {
		Integer[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
		Sort0And1 obj = new Sort0And1();
		System.out.println(Arrays.toString(obj.twoIndexMethod(arr)));
		System.out.println(Arrays.toString(obj.countMethod(arr)));
	}
	
	private Integer[] twoIndexMethod(Integer[] arr){
		int tempLowIndex=0;
		int tempHighIndex=arr.length-1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==0){
				arr[tempLowIndex] = arr[i];
				tempLowIndex++;
			} else {
				arr[tempHighIndex] = arr[i];
				tempHighIndex--;
			}
		}
		return arr;
	}
	
	private Integer[] countMethod(Integer[] arr){
		int countOfZero = 0;
		int i = 0;
		while(i<=arr.length-1){
			if(arr[i]==0)
				countOfZero++;
			i++;
		}
		for (int j = 0; j < arr.length; j++) {
			if(j < countOfZero){
				arr[j] = 0;
			} else {
				arr[j] = 1;
			}
		}
		return arr;
	}
}
