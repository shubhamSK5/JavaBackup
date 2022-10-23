package com.coreJava.Strings;

public class ReverseString {

	public static void main(String[] args) 
	{
		String a="Kasbe";
		String as[]=a.split("");
		for(int s=as.length-1; s>=0; s--)
		{
			System.out.print(as[s]);
		}
	}

}
