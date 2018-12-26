package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class FutureVal {

	
	public static void main(String Args[]) {
		
		
		System.out.println("Enter a value:");
	      double	value = Utility.getDouble();
		
		System.out.println("Enter a value of rate: ");
		  double rate = Utility.getDouble();
		
		System.out.println("Enter a value of time interval: ");
		  double time = Utility.getInt();
		
		 double futureValue = MathFuction1.futureValue1(value , rate , time);
	   	 System.out.println("Print the future value :"+futureValue);

	}
}
