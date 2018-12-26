package com.bridgelabz.datastructure;
import java.io.IOException;

import com.utility.Utility;

public class UnorderedList {

	public static void main(String[] args) throws IOException {
		
		MyLinkedList<String> mll=new MyLinkedList<String>();
		String fileName ="/home/bridgeit/eclipse-workspace/BridgelabzProgram/unorder.txt";
		String readfile=Utility.readAllFile(fileName);
		String numArray[]=readfile.split(" ");
		for(int i=0;i<numArray.length;i++)
		{
			mll.add(numArray[i]);
		}
		System.out.println("Linked List elements are :");
		mll.display();
		System.out.println();
		System.out.println("Enter the elements you want to search");
		String searchElement=Utility.getString();
		System.out.println();
		Utility.unorderedList(searchElement, mll);

		}
	
}



