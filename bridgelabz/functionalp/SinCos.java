package com.bridgelabz.functionalp;

import com.utility.Utility;

public class SinCos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//sinx
	    
	    System.out.println("Enter value of angle: ");
		double value = Utility.getDouble();
	     
		double  result= Utility.sinAngle(value);
		System.out.println(result);
		
	/*	System.out.println("Enter any number till that you want taylor series: ");
		int n1 = Utility.getInt();
		double sinx= Utility.sin(x,n);
		System.out.println("Sinx = "+sinx);*/
		
		
		//cosx
		 System.out.println("Enter value of x: ");
		double xx = Utility.getDouble();
		double x2 = Utility.cosAngle(xx);
		System.out.println("value of cos "+xx+" is : "+x2);

	}

}
