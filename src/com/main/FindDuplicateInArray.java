package com.main;

import java.util.HashSet;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// To find duplicates in an array using Set
		
		String[] strArray = {"abc","lmn","pqr","pqr","lmn","xyz","efd"};
		
		HashSet <String> setArray = new HashSet<String>();
		
		for (String element : strArray)
		{
			if(setArray.add(element) == false)
			{
				System.out.println("Duplicate string :"+element);
			}
		}
		

	}

}
