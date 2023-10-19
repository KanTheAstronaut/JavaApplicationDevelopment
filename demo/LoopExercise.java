package demo;
import java.util.*;
public class LoopExercise {
	Scanner sc = new Scanner(System.in);
	public void reverse() {
		System.out.print("enter a number:");
		int num = sc.nextInt();
		int rev= 0 , temp = num, rem = 0;
		
		// using a while loop
		while(temp > 0) {
			rem = temp % 10;
			rev = rev * 10 + rem;
			temp /= 10;
		}
		System.out.println("reversed using while loop: " + rev);
		
		// using a for loop
		for(; temp > 0; temp/=10) {
			rem = temp % 10;
			rev = rev * 10 + rem;
		}
		System.out.println("reversed using for loop: " + rev);
		
}
}
