package com.coreJava.Strings;

public class UperToLowerToUpper {

	public static void main(String[] args) 
	{
		String s="Suryakant";
		String d= new String ("suryakant Arjunroa Kasbe");
		String c= "";
		System.out.println(s.toLowerCase());
		System.out.println(d.toUpperCase());
		System.out.println(d.length());
		System.out.println(c.isEmpty());
		System.out.println(d.contains(s));
		System.out.println(d.toUpperCase().contains(s.toUpperCase()));
	}

}
