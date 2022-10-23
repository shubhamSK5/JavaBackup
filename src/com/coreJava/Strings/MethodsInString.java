package com.coreJava.Strings;

public class MethodsInString 
{
	public static void main(String[] args) 
	{
		String a="Shubham";
		String b= new String("Shubham");
		String c="Shubham";
		String d= new String("shubham");
		/*System.out.println(a==c);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(c==a);*/
		System.out.println(a.equals(c));
		System.out.println(b.equals(d));
		System.out.println(c.equals(b));
		System.out.println(d.equals(a));
		
	}
}
