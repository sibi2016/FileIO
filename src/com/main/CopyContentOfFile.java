package com.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyContentOfFile {

	public static void main(String[] args) {
		// To copy contents of a file into another file.
		
		//try {
			/*FileWriter fr = new FileWriter("firstfile.txt");
			BufferedWriter bwriter = new BufferedWriter(fr);
			
			bwriter.write("This is using BufferedWriter.This file needs to be copied to another file."); 
			bwriter.flush();
			bwriter.close();*/
			//FileReader fr = new FileReader("firstfile.txt");
			//FileWriter fw = new FileWriter("Secondfile.txt");
			//BufferedReader br = new BufferedReader(fr);
			//String str = br.readLine();
			//System.out.println(str);
			//int j = fr.read();
			//while(j != -1)
			//{
			//	fw.write((char)j);;
			//}
			
			
			//fr.close();
			//fw.close();
		//} catch (IOException e) {
			
		//	e.printStackTrace();
		//}
		
		    File infile =new File("firstfile.txt");
		    File outfile =new File("Secondfile.txt");


	       try {
			FileInputStream in = new FileInputStream(infile);
		
	FileOutputStream out = new FileOutputStream(outfile);
	byte[] buffer = new byte[1024];
		    int l;
		    while ((l = in.read(buffer)) > 0){
		    	out.write(buffer, 0, l);}
		    	 in.close();
		    	    out.close();
		    	    	}
		    	    catch (Exception e) {
		    			e.printStackTrace();}

		
	}
		

	}


