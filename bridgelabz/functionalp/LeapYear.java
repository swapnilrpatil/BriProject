package com.bridgelabz.functionalp;

import com.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initializing variables
				System.out.println("Enter a leap year:");
				int year=Utility.getInt();
				boolean result =Utility.leapYearCheaker(year);
			 
				if(result)
				{
					System.out.println("Year:"+ year + " is a leap year");
				}
				else
				{
					System.out.println("Year:"+ year + " is not a leap year");
				}
		
	}

}
