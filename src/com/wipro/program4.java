package com.wipro;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = new String(sc.next());
		int length = word.length();
		if(length % 2 == 0) {			
			System.out.println(word.substring(0, length/2));
		}
		else {
			System.out.println("null");
		}
	}

}
