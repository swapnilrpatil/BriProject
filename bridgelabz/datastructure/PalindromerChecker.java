package com.bridgelabz.datastructure;

import com.utility.Utility;
import java.util.*;

public class PalindromerChecker {

	public static void main(String args[]) {
		
			//Take the user input as a string
			System.out.println("Enter a String to check :");
			String string=Utility.getString();
			
    double flag = Utility.palindromeCheker(string); 

    if(flag==0)
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		}
}
