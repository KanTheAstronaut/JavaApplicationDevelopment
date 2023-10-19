package demo;
import java.util.*;

public class ArrayExample {
	
	public void arrayEx() {
		Scanner sc = new Scanner(System.in);
		// 1st method  
		int[] intArr = new int[5];

		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
		
		System.out.println("1st method:");
		for (int i = 0; i < 5; i++) {
			System.out.println(intArr[i]);
		}

		System.out.println("---------------");
		
		// 2nd method (size relies on data given in data constructor)
		System.out.println("2nd method:");
		int[] intArr1 = { 1, 3, 5, 7 };
		for (int i = 0; i < 4; i++) {
			System.out.println(intArr1[i]);
		}

		System.out.println("---------------");
		
		// 3rd method (ask user for size/pass an integer variable as the size)
		System.out.println("3rd method:");
		System.out.print("enter the size of your array: ");
		int size = sc.nextInt();
		int[] intArrayUser = new int[size]; // Array of integers//double//float//char//string

		System.out.println("enter the values of your array:");
		for (int i = 0; i < size; i++) // Get user input integer array values
		{
			intArrayUser[i] = sc.nextInt();
		}
		System.out.println("values:");

		for (int i = 0; i < size; i++) {
			System.out.println(intArrayUser[i]);
		}
		System.out.println("string array: ");
		// 1st method string array example?
		String[] arrStr = new String[10]; 
		arrStr[0] = "Hell";
		
		System.out.println(arrStr[0]);
		sc.close();
	}
}
