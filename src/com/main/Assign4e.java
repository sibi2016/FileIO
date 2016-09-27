package com.main;

import java.io.File;

public class Assign4e {

	public static void main(String[] args) {
		
				//List of all filenames in a folder
		        File file = new File("C:/Users/Sibi/Desktop");
		        File[] files = file.listFiles();
		        
		        for(File f: files){
		            System.out.println(f.getName());
		        }
		    }
		}
	
