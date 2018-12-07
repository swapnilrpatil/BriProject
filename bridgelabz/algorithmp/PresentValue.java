package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class PresentValue {

	public static void main(String Args[]) {
		

		System.out.println("Enter a value:");
	      double value = Utility.getDouble();
		
		System.out.println("Enter a value of rate: ");
		  double rate = Utility.getDouble();
		
		System.out.println("Enter a value of time interval: ");
		  double time = Utility.getInt();
		  
		  
		  double presentValue = MathFuction1.presentValue(value , rate , time);
		  System.out.println("Print the Present value:"+presentValue);
	}
	
	
}
