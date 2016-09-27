package com.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CountNoOfWords {

	public static void main(String[] args) throws IOException {
		
				
		File file = new File("C:/Users/Sibi/Desktop/file.txt");
		Scanner sc = new Scanner(new FileInputStream(file));
		int count=0;
		while(sc.hasNext())
		{
			System.out.println(sc.next());  
		    count++;
		}
		System.out.println("Number of words: " + count);
		sc.close();
	}
		

}
