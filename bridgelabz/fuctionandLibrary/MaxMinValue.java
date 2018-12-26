package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class MaxMinValue {

	public static void main(String[] args) {
 
		int [] myArray = {50,25,20,10,9};
	//	MaxMinValue minMax = new MaxMinValue();
	//	int result = Utility.minMax(myArray);
	
		int result = MathFuction1.max(myArray);
		int result1 = MathFuction1.min(myArray);
	 
		Utility minMax = new Utility();;
		System.out.println(" the Maximum number is:"+minMax.max(myArray));
		System.out.println(" the Manimum number is:"+minMax.min(myArray));
			
	 
	}

	
}
