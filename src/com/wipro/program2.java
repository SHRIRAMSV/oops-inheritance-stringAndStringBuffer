package com.wipro;

import java.util.Scanner;

public class program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string");
		String word1 = new String(sc.next());
		System.out.println("Enter a second string");
		String word2 = new String(sc.next());
		String word3 = word1.concat(word2);
		int length = word1.length();
		String data = new String();

		if (word1.charAt(length - 1) == word2.charAt(0)) {
			StringBuffer sb = new StringBuffer(word3);
			sb.deleteCharAt(length - 1);
			data = sb.toString();
			System.out.println(data.toLowerCase());
		} else {
			StringBuffer sb = new StringBuffer(word3);
			sb.insert(length, " ");
			data = sb.toString();
			System.out.println(data.toLowerCase());
		}

	}

}
