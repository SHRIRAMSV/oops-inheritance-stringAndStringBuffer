package com.wipro;

import java.util.Scanner;

public class program1 {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String word = new String(sc.next());
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();
		String data = sb.toString();
		if(word.equals(data)) {
			System.out.println("The given string is Palindrome");
		}
		else {
			System.out.println("The given string is not a Palindrome");
		}
	}

}
