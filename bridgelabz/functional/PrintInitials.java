package com.bridgelabz.functional;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrintInitials {

		 public void printPattern(String path) throws FileNotFoundException
		 {
			 path = "/home/bridgeit/eclipse-workspace/BridgelabzProgram/"+path;
			 File file =   new File(path); 
			    Scanner sc = new Scanner(file); 
			  
			    while (sc.hasNextLine()) 
			      System.out.println(sc.nextLine()); 
			  
		 }
		public static void main(String[] args) throws IOException
		{
			// TODO Auto-generated method stub
			/*File file = new File("patternK.txt");
			
			BufferedReader br = new BufferedReader(new FileReader(file)); 
			  
			  String st; 
			  while ((st = br.readLine()) != null) 
			    System.out.println(st); */
			System.out.println("Enter a initial to print pattern:");
			Scanner scanner = new Scanner(System.in);
			PrintInitials ptn= new PrintInitials();
			String initial = scanner.next();
			char ch = initial.charAt(0);
			
			switch(ch)
			{
			case 'K': ptn.printPattern("PatternOfK.txt");
						break;
			
			case 'D': ptn.printPattern("PatternOfD.txt");
						break;
						
			case 'W': ptn.printPattern("PatternOfW.txt");
						break;
			}
			
			
			 

		}

	}

