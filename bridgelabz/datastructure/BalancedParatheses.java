package com.bridgelabz.datastructure;

import com.utility.Utility;

public class BalancedParatheses {

	public static void main(String[] args) {
		
		System.out.println("Enter a Arithmetic expression ");
		String expression=Utility.getString();
		//Method is used to the user enter the valid Expression or not
		if(Utility.checkForValidExpression(expression)==true)
		{
			System.out.println("The given expression is balanced");
		}
		else
		{
			System.out.println("The given expression is not balanced");
		}
	
	}

}
