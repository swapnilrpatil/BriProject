package com.bridgelabz.functional;

import com.utility.Utility;

public class SinSeries {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Utility utility = new Utility();
		System.out.println("enter the number of turn to print the series u have: ");
		int number = Utility.getInt();
		
		System.out.println("enter value of degree u have:");
         double degree = Utility.getDouble();	
         
         Utility.printSeriesOfSin1(number , degree);
         

	}
	
}
