package com.example;

public class PermutationString {

	public static void main(String[] args) {
		permutation("", "ABDC");
//		perm2("ABDC");
	}
	
	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	 public static void perm2(String s) {
	        int n = s.length();
	        char[] a = new char[n];
	        for (int i = 0; i < n; i++)
	            a[i] = s.charAt(i);
	        perm2(a, n);
	    }

	    private static void perm2(char[] a, int n) {
	        if (n == 1) {
	            System.out.println(new String(a));
	            return;
	        }
	        for (int i = 0; i < n; i++) {
	            swap(a, i, n-1);
	            perm2(a, n-1);
	            swap(a, i, n-1);
	        }
	    }  

	    // swap the characters at indices i and j
	    private static void swap(char[] a, int i, int j) {
	        char c = a[i];
	        a[i] = a[j];
	        a[j] = c;
	    }
}
