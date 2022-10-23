package com.coreJava.Strings;

public class EqualsIgnoreCase {

	public static void main(String[] args) 
	{
		String a="Shubham";
		String b= new String("Shubham");
		String c="Shubham";
		String d= new String("shubham");
		System.out.println(a.equalsIgnoreCase(c));
		System.out.println(b.equalsIgnoreCase(c));
		System.out.println(c.equalsIgnoreCase(d));
		System.out.println(d.equalsIgnoreCase(a));
	}

}
