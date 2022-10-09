package com.careJava.basics;

public class DefaultConstructor 
{
	DefaultConstructor()
	{
		System.out.println("default values of constructor members");
		int a = 0;
		char b;
		float c = 0;
		String d = null; 
		System.out.println(a);
		System.out.println('b');
		System.out.println(c);
		System.out.println(d);
	}
	
	public void metjod2()
	{
		System.out.println("            ");
		System.out.println("User Defined values of constructor members");
		int a = 23;
		char b='S';
		float c = 3215.32f;
		String d = "Kasbe";
		System.out.println(a);
		System.out.println('b'+'S');
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) 
	{
		DefaultConstructor fg= new DefaultConstructor();
		fg.metjod2();
	}
}
