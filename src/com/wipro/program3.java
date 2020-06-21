package com.wipro;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = new String(sc.next());
		int length = word.length();
		
		for(int i=0;i<length;i++) {
			System.out.print(word.charAt(0) + "" + word.charAt(1));
		}
			

	}

}
