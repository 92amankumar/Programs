package com.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class AllDistinctSubstrings {
	public int printSubstringsOfParticularLength(String text, int length) {
		Set<String> set = new HashSet<String>();
		for (int i = 0; i < text.length() - length + 1; i++) {
			String sub = text.substring(i, length + i);
			set.add(sub);
		}
		for (String str : set) {
			System.out.println(str);
		}
		return set.size();
	}

	public Set<String> getAllUniqueSubset(String str) {
		Set<String> set = new LinkedHashSet<String>();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j <= i; j++) {
				String substr = str.substring(j, i + 1);
				if (!set.contains(substr)) {
					set.add(substr);
				}
			}
		}
		return set;
	}

	public static void main(String[] args) {
		// System.out.println("Total: "+new 1 2 6 10 15 21 28
		// AllDistinctSubstrings().printSubstringsOfParticularLength("test",
		// 2));
		Set<String> set = new AllDistinctSubstrings().getAllUniqueSubset("BANANA");
		System.out.println("Size:"+set.size());
		System.out.println(set);
	}
}
