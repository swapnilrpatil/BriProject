package com.bridgelabz.functional;

import java.util.Scanner;

import com.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 	System.out.println("Enter a number of length to Print Harmonic Series:");
	     int  number = Utility.getInt();
		
	 
		 	double result = Utility.harmonicValue(number);
     		System.out.println("series addition is :"+result); 
	
	}		
}
