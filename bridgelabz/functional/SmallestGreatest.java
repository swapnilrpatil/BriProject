package com.bridgelabz.functional;

import com.utility.Utility;

public class SmallestGreatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter elements: ");
		int a[] = new int[7];
		for(int i = 0 ; i < a.length ; i++) {
			a[i] = Utility.getInt();
		}
           Utility.secondLargeAndSmallElement(a);
	}

	}

