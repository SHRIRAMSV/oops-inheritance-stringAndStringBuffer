package com.wipro;

import java.util.Scanner;

public class program7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = new String(sc.next());
		int length = word.length();

		if (word.charAt(0) == 'x' || word.charAt(length - 1) == 'x') {
			if (word.charAt(0) == 'x' && word.charAt(length - 1) == 'x')
				System.out.println(word.substring(1, length - 1));
			else if (word.charAt(length - 1) == 'x')
				System.out.println(word.substring(0, length - 1));
			else
				System.out.println(word.substring(1, length));

		} else {
			System.out.println(word);
		}
	}

}
