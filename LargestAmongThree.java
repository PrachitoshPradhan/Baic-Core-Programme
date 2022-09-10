package com.day5JavaCore;
import java.util.Scanner;

public class LargestAmongThree {
	public static void main(String[] args) {
		
		System.out.println("Welcome to the LargestAmongThree programme.");
		
		Scanner sc= new Scanner(System.in);
		
		int num[]= new int[3];
		for (int i=0; i<3; i++)
		{
			System.out.println("Enter number "+(i+1)+"= ");
			num [i]= sc.nextInt();
		}
		System.out.println("The numbers you entered are "+num[0]+", "+num[1]+", "+num[2]);
		int largest = num[0];
		for (int i=0; i < 3; i++)
		{
			if (largest < num[i])
			{
				largest = num[i];
		    }
	    }
		System.out.println("The largest number among the three is "+largest);
		sc.close();
        }
	

}
