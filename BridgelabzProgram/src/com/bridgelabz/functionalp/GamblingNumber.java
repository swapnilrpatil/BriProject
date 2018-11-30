package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;

public class GamblingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Enter the value of stake:");
		int stake = Utility.getInt();
		
		System.out.println("Enter the value of goal:");
		int goal = Utility.getInt();
		
		System.out.println("Enter the value of no of times:");
		int noOfTimes = Utility.getInt();
		
		Utility.checkGambling(goal , stake ,noOfTimes);
		
		
		
		
		
		
	}

}
