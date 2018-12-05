package com.birdgelabz.datastructurep;

import java.util.Arrays;
import java.util.Scanner;

public class B2Word {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		   int i;  

		   System.out.println("Enter number of words you wish to input: ");
		   int n=sc.nextInt();

		   String[] words= new String[n];

		   System.out.println("Enter the words");
		   for ( i = 0; i < words.length; i++)
		   {
		       System.out.print("WORD " + (i + 1) + ": ");
		       words[i] = sc.next();
		   }

		   System.out.println("enter the word you want to search for");
		   String word=sc.next();

		   Arrays.sort(words);
		  for( i=0;i<words.length;i++) {
			  System.out.println(i+":"+words[i]);
		  }


		   int index= Arrays.binarySearch(words,word);
		   System.out.println(word+ "="+ index);

		
	}

	//Arrays.sort(words); for(int i = 0; i < words.length; i++){ System.out.println(i+": "+words[i]) }
	
}
