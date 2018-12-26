package com.bridgelabz.functional;

	import java.util.Random;
	import java.util.Scanner;
	import java.util.Arrays;

	public class RadomNumber
	 {
		static Scanner sc = new Scanner(System.in);
		
		public static void main(String args[])
		{
			System.out.println("How many RandomNumber do you want to generate(N): ");

			int nRandoms = sc.nextInt();

			System.out.println("Random number require to genrate"+nRandoms+" is :");

			//cuponsNumber.generateCoupon(numberOfCupons);
			RadomNumber rand = new RadomNumber();
			rand.generateRandomNumber(nRandoms);
		}

		public void generateRandomNumber(int nRandoms) 
		{

		int randomNo, flag = 0, index = 1;
			int a[] = new int[nRandoms];
			a[0] = (int) (nRandoms * Math.random());
			//System.out.print( 25* Math.random());
			while (index < nRandoms) 
			{
				randomNo = (int) (Math.random() * nRandoms);
				for (int j = 0; j < index; j++) // to check length of random number which is already exit or not in array
				{
					if (a[j] == randomNo)
					{
						flag = 1;
					}
				} 
				if (flag == 0)
				{ 
					a[index] = randomNo;
					index++;
				}
				flag =0;
			} 
			Arrays.sort(a);
			for (int i : a) 
			{
				System.out.println(i);
			}
		}
	}


