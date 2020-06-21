package com.wipro;

import java.util.Scanner;

public class program10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String word = new String(sc.next());
		System.out.println("Enter an integer");
		int length = word.length();
		int num = sc.nextInt();
		
		for(int i=0;i<num;i++) {
			int index = length - num;
			for(int j = index; j < length; j++) {
			System.out.print(word.charAt(j));
		}
		}		

	}
	}


