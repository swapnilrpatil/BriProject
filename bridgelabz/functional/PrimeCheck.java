package com.bridgelabz.functional;

import com.utility.Utility;

public class PrimeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to check :");
		int n = Utility.getInt();
		
		for(int i=2;i<=n;i++) {
			if(Utility.isPrime(n)) {
				//System.out.println(n);
			}
		}
		boolean result = Utility.isPrime(n);
		System.out.println("print result:"+result);
		

	}

}
