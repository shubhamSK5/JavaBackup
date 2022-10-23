package com.coreJava.Strings;

public class ReverseName 
{
	public static void main(String[] args) 
	{
		String a="Shubham";
		String sk[]=a.split("");
		for(int i=sk.length-1; i>=0; i--)
		{
			System.out.print(sk[i]);
		}
		
//  second aproch
		
		/*for(int j=sk.length-1; j>=0; j--)
		{
			System.out.println(a.charAt(j));
		}
		System.out.println();*/
	}
}
