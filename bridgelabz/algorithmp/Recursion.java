package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class Recursion {
	
	public static void main(String args[]) {
		
		System.out.println("enter a string for a recursion :");
		String str = Utility.getString();
		
		Utility.recursion(str , 0 ,str.length());
	}

}
