package demo;

import java.util.Scanner;

public class CalculateSum {
	
	private int value1;
	public int value2;
	protected String name;
	Scanner scanner = new Scanner(System.in);
	
	public void Calculate() {
//		name = scanner.next();
		System.out.println("enter the first number");
		value1 = scanner.nextInt();
		System.out.println("enter the second number");
		value2 = scanner.nextInt();
		System.out.println("total: " + (value1 + value2));
	}
}