package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;

public class Sqrt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Enter the no to find SquareRoot of Number:");
       double c = Utility.getDouble();
       double  epsilon = 1e-15;
	   double t = c;
      
    while(Math.abs(t-c/t)>epsilon*t) {
    	t=(c/t+t)/2.0;
    	
        }
		
     System.out.println(t);
	}

}
