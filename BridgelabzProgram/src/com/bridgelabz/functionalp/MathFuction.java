package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class MathFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a choice do you want: ");
		int choice = Utility.getInt();
		
	switch(choice) {
	
	case 1:
		  System.out.println("Enter a harmonic number to print a series :");
		  int number = Utility.getInt();
		  double result = Utility.harmonicValue(number);
		  System.out.println(result);
		  break;

	case 2: 
		  System.out.println("Enter a number for sin value");
		  int value = Utility.getInt();
		  //int result = Utility.
		  //break;
		  
	case 3:
		 System.out.println("Enter a cosin value:");
		 int value1 = Utility.getInt();
		 break;
		 
	case 4:
		System.out.println("Enter a deimal value: ");
		 int number1 = Utility.getInt();
		 String result4 =Utility.toBinary(number1);
		 System.out.println(result4);
		break;
		
	case 5:
		System.out.println("enter a value of square root:");
	    int c= Utility.getInt();
	    double result1 = Utility.findSquare(c);
	    System.out.println(result1);
	      break;
	    
	}
}
}
