package demo;

import java.io.*;
import java.util.Scanner;

public class Files {
	public static void main(String[] args) throws IOException {

		File fileObj1 = new File("/Users/kanepu/Downloads/test.txt");
		try {
			if (fileObj1.createNewFile()) {
				System.out.println("test Created!");
			} else {
				System.out.println("already exists");
			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();

		}
		// 1st method (writing using filewriter)

		FileWriter fWrite = new FileWriter("/Users/kanepu/Downloads/test.txt");
		fWrite.write("line 1 content" + "\n");
		fWrite.append("line 2 content" + "\n");
		fWrite.write("line 3 content");
		fWrite.close();

		// 2nd method (write using bufferedwriter until user escapes loop)

		Scanner sc = new Scanner(System.in);
		FileWriter file = new FileWriter("/Users/kanepu/Downloads/test.txt");
		String data = "";
		BufferedWriter bf = null;
		try {
			System.out.println("enter content: ");
			bf = new BufferedWriter(file);
			while (!data.contentEquals("/")) {
				data = sc.nextLine();
				bf.write(data, 0, data.length());
				bf.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		bf.close();
		sc.close();

		// 3rd method using buffered

		
		Scanner sc1 = new Scanner(System.in);
		FileWriter file1 = new FileWriter("/Users/kanepu/Downloads/test.txt");
		String data1 = "";
		BufferedWriter bf1 = null;
		try {
			System.out.println("enter content: ");
			data1 = sc1.nextLine();
			System.out.println("enter the offset: ");
			int offset = sc1.nextInt();
			bf1 = new BufferedWriter(file1);
			bf1.write(data1, offset, data1.length() - offset);
			// bf.write(data, 0, data.length());
		} catch (IOException e) {
			e.printStackTrace();
		}
		bf1.close();
		sc1.close();
		 
		// read file
		char[] array = new char[100];
		try {
			FileReader readFile = new FileReader("/Users/kanepu/Downloads/test.txt");

			// read all chars and apply them to the char array
			readFile.read(array);
			System.out.println("file data:");
			System.out.println(array);
			readFile.close();
		} catch (Exception e) {
			e.getStackTrace();
		}

		// delete file
		File filedelete = new File("/Users/kanepu/Downloads/test.txt");

		// deletes the file
		boolean value = filedelete.delete();
		if (value) {
			System.out.println("file poof");
		} else {
			System.out.println("file not poof");
		}
	}
}
