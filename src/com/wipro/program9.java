package com.wipro;

import java.util.Scanner;

public class program9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string");
		String word1 = new String(sc.next());
		System.out.println("Enter a second string");
		String word2 = new String(sc.next());
		int length1 = word1.length();
		int length2 = word2.length();

		for (int i = 0, j = 0; i < length1 || j < length2; i++, j++) {
			if (i < length1 && j < length2)
				System.out.print(word1.charAt(i) + "" + word2.charAt(j));
			else if (i < length1)
				System.out.print(word1.charAt(i));
			else if (j < length2)
				System.out.print(word2.charAt(j));
		}
	}

}
