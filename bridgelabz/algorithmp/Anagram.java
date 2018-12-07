package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter 1st string:");
		String str1 = Utility.getString();
		
		System.out.println("Enter 2nd string:");
		String str2 = Utility.getString();
	
		
		double result = StringFuction.isAnagram(str1, str2);
		//System.out.println("print result is :"+result);
	}
 
}
