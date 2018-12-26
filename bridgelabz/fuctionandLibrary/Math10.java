package com.bridgelabz.fuctionandLibrary;

import com.utility.Utility;

public class Math10 {

	public static void main(String[] args) {

		int array[] =  new int [] {10,20,32,2,5,58,10};
		
		int max = Utility.maxUsingString(array);
		System.out.println("maximum value of result is:"+max);
		
		int min = Utility.minUsingString(array);
		System.out.println("minimum number is :"+min);
		
		
	}

}
