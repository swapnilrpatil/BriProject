package com.bridgelabz.fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StringRep {

	public static void main(String[] args) throws IOException {
		
		File file = new File("poem.txt"); 
		  
		  BufferedReader br = new BufferedReader(new FileReader(file)); 
		  
		  String st; 
		  while ((st = br.readLine()) != null) 
		    System.out.println(st); 
		  } 
	
	
	
	
	String store = "";
	
	
	
	
	}

