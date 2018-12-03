package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("  Enter a year: ");
		int y = Utility.getInt();
		System.out.println("  Enter a month: ");
		int m = Utility.getInt();
		System.out.println(" Enter a Day: ");
		int d = Utility.getInt();
	  
		int result = Utility.getDayOfWeek(y,m,d);
		
		  String[] array = {"Sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		  System.out.println(array[result]);
	}

	}


