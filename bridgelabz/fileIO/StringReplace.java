package com.bridgelabz.fileIO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.utility.Utility;

public class StringReplace  {

	 public static String replaceFile(String filePath ,String oldString , String newString) throws FileNotFoundException {
	
	File file = new File("poem.txt");
//	BufferedReader reader = new BufferedReader(new FileReader(file));
	
	String  oldContent = "";
   BufferedReader reader = null;
	 FileWriter writer = null;
	 
		
		try {
			reader = new BufferedReader(new FileReader(file));

			String line = reader.readLine();
			
			while(line != null) {
				oldContent = oldContent +line +System.lineSeparator();
				line = reader.readLine();
			}
			String newContent = oldContent.replaceAll(oldString, newString);
			
			writer = new FileWriter(file);
			writer.write(newContent);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			
		
		try {
			reader.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		//return replaceFile(filePath, oldString, newString);
		return newString;
}
	 public static void main(String args[]) throws FileNotFoundException {
		 
 	 String filePath = "";
    String oldString = "";
	String newString = "";
		 System.out.println("enter a animal name");
		 String animal = Utility.getString();
		 System.out.println("Enter sound name");
		 String sound = Utility.getString();
	String store =	 replaceFile(filePath ,oldString , newString);
		 System.out.println(store);
		// System.out.print(replaceFile(filePath, oldString, newString));
	 }
}