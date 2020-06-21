package com.wipro;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first string");
		String word1 = new String(sc.next());
		System.out.println("Enter a second string");
		String word2 = new String(sc.next());
		int length1 = word1.length();
		int length2 = word2.length();
		
		if(length1<length2) {
			System.out.println(word1 + "" + word2 + "" + word1);
		}
		else {
			System.out.println(word2 + "" + word1 + "" + word2);
		}
	}

}
