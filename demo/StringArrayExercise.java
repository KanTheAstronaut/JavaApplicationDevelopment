package demo;

import java.util.Arrays;
import java.util.HashSet;

public class StringArrayExercise {
	public static void main(String[] args) 
    {
		
       String[] array1 = {"Python", "JAVA", "PHP", "C#", "C++", "SQL"};
 
       String[] array2 = {"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"};
       
       System.out.println("array1: "+Arrays.toString(array1));
       System.out.println("array2: "+Arrays.toString(array2));
 
       HashSet<String> set = new HashSet<String>();
 
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if(array1[i].equals(array2[j]))
                {
                    set.add(array1[i]);
                }
            }
        }
 
        System.out.println("Common element: " + set);
    }
}