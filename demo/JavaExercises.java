package demo;

import java.util.Scanner;

public class JavaExercises {
	Scanner scanner = new Scanner(System.in);

	public void evenNumbersEx1() {
		System.out.println("give me a max integer range number: ");
		var range = scanner.nextInt();
		// despite 0 being an even number the exercise sheet shows that when given 10 as the input
		// 0 wouldn't be in the output which indicates that the loop skips 0
		for (int i = 1; i < range; i++) {
			if (i % 2 == 0)
			{
				System.out.printf("%d ", i);
			}
		}
	}
	
	public void greaterNumberEx2() {
		System.out.println("give me a number: ");
		var num1 = scanner.nextInt();
		
		System.out.println("give me another number: ");
		var num2 = scanner.nextInt();
		
		System.out.printf("The largest number is %d", Math.max(num1, num2));
	}
	
	public void gradeExplanationEx3() {
		System.out.println("enter your subject: ");
		var subject = scanner.nextLine();
		
		System.out.println("enter your grade: ");
		var grade = scanner.next();
		
		switch (grade.toLowerCase()) {
			case "a":
				System.out.printf("Excellent | Subject: %s", subject);
				break;
			case "b":
				System.out.printf("Good | Subject: %s", subject);
				break;
			case "c":
				System.out.printf("Try harder | Subject: %s", subject);
				break;
			case "d":
				System.out.printf("Loser | Subject: %s", subject);
				break;
			case "f":
				System.out.printf("Failure | Subject: %s", subject);
				break;
			default:
				System.out.printf("i dont know whether you failed or did well but im assuming you failed beyond comprehension | Subject: %s", subject);
		}
	}
	
	public void namePyramidEx4() {
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        
        int length = name.length();
        
        // create a loop repeating for the amount of chars in the name
        for (int i = 0; i < length; i++) {
            // print the spaces for centering things 
        	// (repeats the space length - i (current iteration i) - 1)
            System.out.print(" ".repeat(length - i - 1));

            name.chars() // convert name to a stream
            	// we can't store this as a variable outside the loop
            	.limit(i + 1) // cut off the array at the specified max size
            	.mapToObj(ch -> (char) ch + " ") // convert each individual char into char + " " so if char
            	// was a it'll be "a" + " " which is "a " (we need to cast them to a char so they don't
            	// remain an ASCII code
            	.forEach(System.out::print); // print each item in the resulting array 
            // System.out::print provides a reference to the method "print" and is the same as
            // (string) -> System.out.print(string) for example

            // print a new line for the pyramid
            System.out.println();
        }
	}
	
	public void namePyramidEx4Simplified() {
        System.out.print("enter your name: ");
        String name = scanner.nextLine();
        
        int length = name.length();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(name.charAt(j) + " ");
            }

            System.out.println();
        }
	}
	
	public void reverseNameEx5() {
        System.out.print("enter your words: ");
        String str = scanner.nextLine();
        
        var words = str.split(" ");
        if (words.length < 2)
        {
        	System.out.println("You don't have a 2nd word to flip");
        	System.out.println(str);
        	return;
        }
        
        var firstWord = words[0];
        words[0] = new StringBuilder(words[1]).reverse().toString();
        words[1] = firstWord;
        
        System.out.println(String.join(" ", words));
	}

	// i
	public void mixCaseEx6() {
        System.out.print("enter your text: ");
        String text = scanner.nextLine();
        var textArray = text.toLowerCase().toCharArray();
        var startsWithLowercase = textArray[0] == text.charAt(0);
        
        for (int i = (startsWithLowercase ? 1 : 0); i < text.length(); i+=2) {
            textArray[i] = Character.toUpperCase(textArray[i]);
        }
        
        System.out.println(String.valueOf(textArray));
	}
	
	public void reverseCaseEx6() {
        System.out.print("enter your text: ");
        String text = scanner.nextLine();
        var textArray = text.toCharArray();
        
        for (int i = 0; i < text.length(); i++) {
        	var current = textArray[i];
            textArray[i] = Character.isUpperCase(current) ? Character.toLowerCase(current) : Character.toUpperCase(current);
        }
        
        System.out.println(String.valueOf(textArray));
	}
	
	public void reformatStringEx7() {
        System.out.print("enter your text: ");
        String text = scanner.nextLine();
        var newLine = '\n';
        var output = text.replace(' ', Character.MIN_VALUE).replace('.', newLine).replace(';', newLine).replace(',', newLine);
        
        System.out.println(output);
	}
}
