package com.example;

/*
 * Strings:You have given a sentence.You have to check the length of each word.
 * If length of word is greater then 4 and is even then put the space in the middle of the word else print the word as it is.
for ex INPUT: Nagarro is my Favourite Company because of career growth.
Output : Nagarro is my Favourite Company because of car eer gro wth.
 * */
public class NagarroString {
	public static void main(String[] args) {
		String str = "Nagarro is my Favourite Company because of career growth";
		String[] arr = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			int lengthOfWord = arr[i].length();
			if (lengthOfWord > 4 && lengthOfWord % 2 == 0) {

			} else {
				sb.append(arr[i]);
			}
		}
	}

}
