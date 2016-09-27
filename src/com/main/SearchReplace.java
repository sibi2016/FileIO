package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchReplace {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("C:/Users/Sibi/Desktop/file.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		Scanner sc1 =  new Scanner(System.in);
		System.out.println("Enter the string to be replaced");
		String search = sc1.next();
		System.out.println("Enter the string to be replaced with");
		String replace = sc1.next();
		String searchword = search.toLowerCase();
		int count=0;
		while(sc.hasNext())
		{
			String word = sc.next();
			if(word.equalsIgnoreCase(searchword))
			{
			System.out.println(word.replace(searchword, replace));
			count++;
		    }
		}
   		System.out.println("Number of times the word "+search+" in the file is: " + count);
		sc.close();
		sc1.close();
		
	}

}
