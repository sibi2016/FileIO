package com.main;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Assignment4a {

	public static void main(String[] args) {
		//Uses Scanner class to input 2 integers and sum them
		System.out.println("To find the sum of two numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		int n = n1 + n2;
		System.out.println("Sum of these numbers is "+ n);
		
		//Using BufferedReader and InputStreamReader
		System.out.println("To find the difference  of two numbers");
		System.out.println("Enter the first number");
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		try {
			String s = br.readLine();
			int i1 = Integer.parseInt(s);
			System.out.println("Enter the second number");
			s = br.readLine();
			int i2 = Integer.parseInt(s);
			int i = i1-i2;
			System.out.println("Difference between the integers is "+i);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}		
		
		//Using DataInputStreamReader to input two integers and multiply them
		System.out.println("Find the product of two integers");
		DataInputStream data = new DataInputStream(System.in);
		try {
			System.out.println("Enter the first number");
			@SuppressWarnings("deprecation")
			int m1 = Integer.parseInt(data.readLine());
			System.out.println("Enter the second number");
			int m2 = Integer.parseInt(data.readLine());
			int m = m1*m2;
			System.out.println("The product is "+m);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Using Console class to input integers and divide them
		System.out.println("Divide two integers");
		
		try{
			Console con = System.console();
			
			if(con!= null)
			{
		        String s1 = con.readLine("Please enter your first number:");
		        int m1 = Integer.parseInt(s1);
		        String s2 = con.readLine("Please enter your second number: ");
		        int m2 = Integer.parseInt(s2);
		      
		        int d = m1 / m2;
		        
		        System.out.print(d);
			}
			}catch(NullPointerException e)
			 {
	        	System.out.println("error " +e.getMessage());
	        }

	}
	

}
