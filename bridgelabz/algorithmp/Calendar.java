package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class Calendar {

	public static void main(String[] args) {
		
		int month;
		System.out.println("Enter month");
		month=Utility.getInt();
		System.out.println("Enter year");
		int year=Utility.getInt();
		Utility.calender(month, year);

	}

}
