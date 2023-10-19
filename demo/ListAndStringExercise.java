package demo;

import java.util.ArrayList;
import java.util.List;

public class ListAndStringExercise {
	
	String value = "Java is a(n) popular(ancient) language";
	List<String> colors = new ArrayList<String>();

    
	public void stringExercise() {
	    colors.add("green");
	    colors.add("blue");
	    colors.add("orange");
	for(String i : colors){
		System.out.println(i);
	}

	System.out.println(value.toLowerCase());
	System.out.println(value.toUpperCase());
	}

}
