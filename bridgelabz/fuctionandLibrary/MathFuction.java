package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class MathFuction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1:Harmonic number\n2:sin value\n3.cosin value\n4.decimal value\n5.string using iteration");
		System.out.println(" Enter a choice do you want: ");
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
		  double result2 = Utility.sinAngle(value);
		  System.out.println("sin"+(value)+"is: "+result2);
		     break;
		  
	case 3:
		 System.out.println("Enter a cosin value:");
		 int value1 = Utility.getInt();
		 double result3 =Utility.cosAngle(value1);
		 System.out.println("cos"+(value1)+" is:"+result3);
		 break;
		 
	case 4:
		System.out.println("Enter a deimal value: ");
		 int number1 = Utility.getInt();
		 String result4 =Utility.toBinary(number1);
		 System.out.println(result4);
		break;
	
	
	
	case 5: 
		System.out.println("Enter String you want for iteraton : ");
		String string = Utility.getString();
	    int len = string.length();
		String result5 = Utility.permutation(string,0,len-1);
		System.out.println(result5);
  		     break;  		
	
	  		
   
	
		/*case 5: System.out.println("Enter a number for to check its palindrome or not:");
  		int n = Utility.getInt();
  		boolean result5 = Utility.isPrime(n);
  		System.out.println(result5);
  		break; */
		
		
		
		
	}
}
}
