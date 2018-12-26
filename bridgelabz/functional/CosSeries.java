package com.bridgelabz.functional;

import com.utility.Utility;

public class CosSeries {

	public static void  main(String args[]) {
		
		
		  
		  System.out.println("enter the turn of number:");
		   int number=Utility.getInt();
		   
		  System.out.println("enter the value for cos in degree:");
		  double degree=Utility.getDouble();
	    CosSeries obj=new CosSeries();
	    CosSeries.cosinSeriesPrint(number, degree);
	}

	
	public static void cosinSeriesPrint(int number ,double degree) {
		
		int temp=0;
		int sum=0;
		int n=0;
		
		 double radians=Math.toRadians(degree);
		 int fact=1;
		 
		 
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}	
		System.out.println();
	}
	
}
