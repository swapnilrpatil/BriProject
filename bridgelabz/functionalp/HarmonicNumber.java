package com.bridgelabz.functionalp;

import com.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to Print Harmonic Series:");
	 int  number = Utility.getInt();
		double result;
		
	 
		 	result = Utility.harmonicValue(number);
	
		System.out.println(result);
	}		
}
