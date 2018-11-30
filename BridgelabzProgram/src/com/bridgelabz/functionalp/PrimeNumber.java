package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;


public class PrimeNumber {
	
	 public static void main(String [] args) {
	 
		//int n = 0;
		//Taking user from input
			 System.out.println("please enter a number 1 to 100:");
			int num=Utility.getInt();
			//calling method
			Utility.primecheck(num);
}
}
