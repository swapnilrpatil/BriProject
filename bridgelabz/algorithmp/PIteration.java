package com.bridgelabz.algorithmp;

import com.utility.Utility;

public class PIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String you want  : ");
		String string = Utility.getString();
		int len = string.length();
		StringFuction.permutation(string,0,len-1);
		
	}
}
