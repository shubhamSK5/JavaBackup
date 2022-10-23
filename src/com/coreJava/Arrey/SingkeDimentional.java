package com.coreJava.Arrey;
import java.util.Arrays;

public class SingkeDimentional 
{
	public static void main(String[] args) 
	{
		int a[]= {1,2,365,89,6,5,7};
		System.out.println("Length of a ="+a.length);
		Arrays.sort(a);
		for(int i=0;i<7; i++)
		{
			System.out.print(a[i]+",");
	    } 
		System.out.println();
		String S[]= {"Shubham", "Suryakant", "Kasbe"};
		System.out.println("Length of S ="+S.length);
		Arrays.sort(S);
		for(int j=0; j<S.length; j++)
		{
			System.out.print(S[j]+" ");
		}
}
}