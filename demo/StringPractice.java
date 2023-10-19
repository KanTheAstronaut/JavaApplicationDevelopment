package demo;

import java.util.Scanner;

public class StringPractice {

	Scanner scanner = new Scanner(System.in);

	String input = new String();
	
	public void upperAndLower() {
		System.out.println("please give me a string: ");
		input = scanner.nextLine();
		System.out.println("uppercase: " + input.toUpperCase());
		System.out.println("lowercase: " + input.toLowerCase());
	}
	
	public void upperOrLower() {
		System.out.println("please give me a string: ");
		input = scanner.nextLine();
		if (input.toLowerCase().equals(input)) {
			System.out.println(input.toUpperCase());
		} else {
			System.out.println(input.toLowerCase());
		}
	}
}

