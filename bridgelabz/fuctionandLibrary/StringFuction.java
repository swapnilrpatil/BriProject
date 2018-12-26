package com.bridgelabz.fuctionandLibrary;

import java.util.Arrays;

import com.utility.Utility;

public class StringFuction {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(" Enter a first string :");
		  String str1 = Utility.getString();
		  //   String string1 = "heart";
		   //  String string = "earth";
		 System.out.println(" Enter a first string :");
		  String str2 = Utility.getString();

		  Utility.isAnagram(str1 , str2);
	} */
	
 //************* Anagram string ***************************************//
	
	//private static final double result = 0;

	public static boolean isAnagramscheck(String s1 , String s2) {
		// TODO Auto-generated method stub
		boolean status = true;
		
		if(s1.length()!= s2.length()) {
			
			status = false;
			
		}
		
		else {
			char [] str1Array = s1.toCharArray();
			char [] str2Array = s2.toCharArray();
			
			Arrays.sort(str1Array);
			Arrays.sort(str2Array);
			
			status = Arrays.equals(str1Array, str2Array);
		}
			if( status ) {
				//System.out.println(s1+  " and " +s2+ " is anagram");
				return true;
			}
			else {
				//System.out.println(s1+  " and " +s2+ "  is not Anagram");
				return false;
			}
	}
	
	
  //*******************Check to string is palindrome or not ********************//
	
	public static void isPalindromeString(String str) {
	             
		int length  = str.length();
        int i, low, high, middle;
      
        low  = 0;
        high    = length - 1;
        middle = (low + high)/2;
 
         for (i = low; i <= middle; i++) {
           if (str.charAt(low) == str.charAt(high)) {
                     low++;
                     high--;
             }
             else {
                     break;
                }
          }
                if (i == middle + 1) {
                    System.out.println("string is a Palindrome");
                    }
                      else {
                             System.out.println("string Not a palindrome");
                          }  

        }
                	
	//*************** Method for to to calculate possible permutation *****************//
	
	 
	public static String permutation(String string, int i, int j) {
		if(i==j)
			System.out.println(string);
		else {
			for(int index =i;index<=j;index++) {
				string = swap(string,i,index);
				permutation(string, i+1, j);
				string = swap(string,i,index);
			}
		}
		return string;
	}

	private static String swap(String string, int i, int j) {
		char temp;
		char[] ch = string.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);
	}
	
	
	
}
