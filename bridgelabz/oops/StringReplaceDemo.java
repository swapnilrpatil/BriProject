package com.bridgelabz.oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.utility.Utility;

public class StringReplaceDemo {

	public static void main(String[] args)  {
		/*// TODO Auto-generated method stub
		
		File file = new File("poem.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
    	String	string = br.readLine();
		String[] array = string.split(",");
		while((string = br.readLine()) != null) {
		string = string+br.readLine();
			System.out.println(string);
			isReplace(string);
		}
}
	public static void isReplace(String string) {
		String store = ""; 
	System.out.println("Enter animal");
		String animal = Utility.getString();
	System.out.println("Enter the sound");
		String sound = Utility.getString();
		 store = string.replaceAll("%ANIMAl%", animal); 
		System.out.println(store);
//		store = string.replaceAll("%ANIMAL%", animal);
//		store.replaceAll("%SOUND%", sound);
//		//return string;
//		System.out.println(store);
		
		
	}*/
		
		String store = "";
		
		System.out.println("ENTER ANIMAL NAME:");
		String animal = Utility.getString();
		System.out.println("Entetr sound name:");
		String sound = Utility.getString();
		
		File file = new File("poem.txt");
		
		
		
}
}
