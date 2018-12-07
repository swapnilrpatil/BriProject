package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class FutureValue {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a value:");
		double value = Utility.getDouble();
		
		System.out.println("Enter a value of rate: ");
		double rate = Utility.getDouble();
		
		System.out.println("Enter a value of time interval: ");
		int time = Utility.getInt();
		
		System.out.println("Enter a choice do you want to perform: ");
		int choice = Utility.getInt(); 
		
	switch(choice) {
		
		case 1:
		     double futureValue = Utility.futureValue(value , rate , time);
   	    	 System.out.println("Print the future value :"+futureValue);
   	    	 break;
   	    	 
		case 2:
			 double presentValue = Utility.presentValue(value , rate , time);
			 System.out.println("Print the Present value:"+presentValue);
			 break;
	}
}
}
