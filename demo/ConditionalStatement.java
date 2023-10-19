package demo;

import java.util.Scanner;

public class ConditionalStatement {
	Scanner sc = new Scanner(System.in);
	private int age;
	public void voteCheck() {
		age = sc.nextInt();
		if(age > 18) {
			System.out.println("can vote");
		}
		else {
			System.out.println("cant vote");
		}
	}
	
	public void weekDay() {
		System.out.println("enter a number that is between 1 and 7: ");
		var day = sc.nextInt();
		
		switch (day) {
			case 1:
				System.out.println("its monday");
				break;
			case 2:
				System.out.println("its tuesday");
				break;
			case 3:
				System.out.println("its wednesday my dudes");
				break;
			case 4:
				System.out.println("its thursday");
				break;
			case 5:
				System.out.println("its friday");
				break;
			case 6:
				System.out.println("its saturday");
				break;
			case 7:
				System.out.println("its sunday");
				break;
			default:
				System.out.println("invalid number");
		}
	}
}
