package com.bridgelabz.functional;

import com.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter decimal number : ");
		int number = Utility.getInt();
		String binary = Utility.toBinary(number);
		System.out.println("Decimal to binary "+binary);
		String swap = Utility.swapNibbles(binary);
		System.out.println("Number after swapping " +swap);
		double decimal = Utility.convertToDecimal(swap);
		System.out.println("New Decimal Number : "+decimal);
		
		
	}
	
}


