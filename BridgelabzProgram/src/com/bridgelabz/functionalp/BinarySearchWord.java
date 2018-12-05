package com.birdgelabz.datastructurep;

import com.utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = new String[5];
		for(int i=0; i<5; i++) 
		{
			System.out.print("words["+i+"]: ");
			words[i] = Utility.getString();
		}
		System.out.print("Enter word to search for: ");
		String word = Utility.getString();

		int index =Utility.binarySearchWord(word, words, 0, words.length);
		if(index < 0) {
			System.out.println("not found");
		} else {
			System.out.println("found at index " + index);
		}

	}


	
}
