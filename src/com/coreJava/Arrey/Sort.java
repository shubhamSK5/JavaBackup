package com.coreJava.Arrey;

import java.util.Arrays;

public class Sort 
{
	
	public static void main(String[] args)
	{
		int s[]= {12,36,54,22,16,84,95,15,363,78,91,06,};
		System.out.println("Lenght of s ="+s.length);
		Arrays.sort(s);
		for (int r=0; r<s.length; r++)
		{
			System.out.print(s[r]+ ", ");
		}
		
    }
}
