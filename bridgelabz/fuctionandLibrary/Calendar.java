package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		
		System.out.println("Enter month");
		int month=Utility.getInt();
		System.out.println("Enter year");
		int year=Utility.getInt();
		Utility.calender(month, year);

	}

}
