package com.wipro;

import java.util.Scanner;

public class program8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = new String(sc.next());
		if(word.contains("*")) {
			int index = word.indexOf("*");
			
			System.out.print(word.substring(0,index-1));
			System.out.print(word.substring(index+2, word.length()));
		}

	}

}
