package com.bridgelabz.functionalp;

import com.bridgelabz.utility.Utility;

public class Sin {

	public static void main(String[] args) {
		
        double x;
		System.out.println("Enter number in degree:");
		//Utility utility=new Utility();
		x=Utility.getDouble();
		x=(x%(2*Math.PI));   //Convert angle x to an angle between ­2 PI and 2 PI using following logic
		double sinx=0;
		int n=1;
		
			int	N=Utility.getInt();

		int count=0;
		while(count!=N)
		{
		
		
		if(count%2==0)
		{
			sinx=sinx+(Math.pow(x,n)/Utility.factorial(n));// if my position at even position then add term else subs term
		}
		else {
		sinx=sinx-(Math.pow(x, n)/Utility.factorial(n));
		}
	
		
		n=n+2;
		count++;}
	
System.out.println(""+sinx);
}

	}


