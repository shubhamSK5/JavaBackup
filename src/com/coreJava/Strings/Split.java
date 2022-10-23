package com.coreJava.Strings;

public class Split {

	public static void main(String[] args) 
	{
		String w="Shubham Suryakant Kasbe";
		String e[]=w.split(" ");
		for(int i=0; i<e.length; i++)
		{
			System.out.println(e[i]+",");
		}
		System.out.println();
		for(int i=e.length-1; i>=0; i--)
		{
			System.out.println(e[i]+"");
		}
	}

}
