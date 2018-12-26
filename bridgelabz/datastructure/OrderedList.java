package com.bridgelabz.datastructure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import com.utility.Utility;

public class OrderedList {

	public static void main(String[] args)  {
		OrderedList o = new OrderedList();
		MyLinkedList<Integer> mll = new MyLinkedList<>();
		
		System.out.println("Enter number to check its going to appropriate position or not");
		int number =  Utility.getInt();
	    
		o.orderListCheck(number );
		
	}

	
	public  void orderListCheck(int number)
	{
		String line = "null";
		String fileReader = " ";
		try {
			FileReader file = new FileReader("/home/bridgeit/eclipse-workspace/BridgelabzProgram/order.txt");
			BufferedReader br = new BufferedReader(file);
			
			char[] array = file.toString().toCharArray(); 
			
			while((line = br.readLine()) != null) 
			{
				System.out.println(line);
			}
			Arrays.sort(array);
			br.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void chekAndSort() 
	{
		char[] array = toString().toCharArray();  
		Arrays.sort(array);
	}
	
	}


