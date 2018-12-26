package com.bridgelabz.datastructure;

import com.utility.Utility;

public class BankingCashCounter {

	public static void main(String[] args) {
		
				//Take user input as a Integer inital amount
				System.out.println("Enter the intial amount in the bank");
				Integer initialAmount=Utility.getInt();
				//Take user input how many people in the queue
				System.out.println("How many people in a queue");
				Integer numberofPerson = Utility.getInt();
				
        		Utility.checkbankingcashCounter(initialAmount , numberofPerson );
				
	}
}
