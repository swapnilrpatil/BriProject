package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;

public class GamblingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		//Utility utility =new Utility();
		System.out.println("Enter how much money the player have");
		int stake=Utility.getInt();
		System.out.println("Enter the goal value,which the player needs to make for the final winnig");
		int goal=Utility.getInt();
		System.out.println("Enter the number of chances the player have");
		int chance=Utility.getInt();
		Utility.calWinLossInGambling(stake,goal,chance);
	}
		
		
		
		
	}

