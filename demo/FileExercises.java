package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileExercises {
	public static void main(String[] args) throws IOException {
		File fileObj = new File("/Users/kanepu/Downloads/test.txt");
		FileWriter fw = new FileWriter("/Users/kanepu/Downloads/test.txt", true);
		fw.append("pewm");
		fw.close();
		
		System.out.println("writable: " + fileObj.canWrite());
		System.out.println("readable: " + fileObj.canRead());
		System.out.println("location: " + fileObj.getAbsolutePath());
		System.out.println("filename: " + fileObj.getName());
		System.out.println("length: " + fileObj.length() + " chars");

	}
}
