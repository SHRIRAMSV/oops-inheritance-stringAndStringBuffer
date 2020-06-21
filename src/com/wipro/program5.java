package com.wipro;

import java.util.Scanner;

public class program5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = new String(sc.next());
		int length = word.length();
		System.out.println(word.substring(1, length-1));
	}

}
