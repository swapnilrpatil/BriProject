package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1st string:");
		String str1 = Utility.getString();
		
		System.out.println("Enter 2nd string:");
		String str2 = Utility.getString();
	
		
		boolean result = StringFuction.isAnagramscheck(str1, str2);
		System.out.println("print result is :"+result);
	}
 
}

