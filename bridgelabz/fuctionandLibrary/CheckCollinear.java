package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class CheckCollinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a value for x1");
		 int x1 = Utility.getInt();
		System.out.println("Enter a value for y1");
		 int y1 = Utility.getInt();
		System.out.println("Enter a value for x2");
		 int x2 = Utility.getInt();
		System.out.println("Enter a value for y2");
		 int y2 = Utility.getInt();
		System.out.println("Enter a value for x3");
		 int x3 = Utility.getInt();
		System.out.println("Enter a value for y3");
		 int y3 = Utility.getInt();
    
	
		
		boolean result = MathFuction1.checkCollinearSlope(x1,y1,x2,y2,x3,y3);
		 
			System.out.println("print the result:"+result);	
		

	}

}
