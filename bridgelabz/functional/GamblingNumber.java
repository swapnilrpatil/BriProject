package com.bridgelabz.functional;

import com.utility.Utility;

public class GamblingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of times you want to play:");
		int noOfTimes = Utility.getInt();
		
		System.out.println("Enter the stake value :");
		int stake = Utility.getInt();
		
		System.out.println("Enter the goal value :");
		int goal = Utility.getInt();

		Utility.gambler(noOfTimes, stake, goal);
	}

}
