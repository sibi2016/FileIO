package com.main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchString {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//To search for a string in a file and number count the no.of occurrences.
		File file = new File("C:/Users/Sibi/Desktop/file.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		Scanner sc1 =  new Scanner(System.in);
		System.out.println("Enter the search string");
		String search = sc1.next();
		String searchword = search.toLowerCase();
		int count=0;
		while(sc.hasNext())
		{
			String word = sc.next();
			if(word.equalsIgnoreCase(searchword))
			{
			count++;
		    }
		}
   		System.out.println("Number of times the word "+search+" in the file is: " + count);
		sc.close();
		sc1.close();

	}

}
