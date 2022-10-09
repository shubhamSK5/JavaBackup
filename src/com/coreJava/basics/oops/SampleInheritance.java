package com.coreJava.basics.oops;
class child 
{
   int Add, a=20, b=30;

public void addition()
	{
		System.out.println("Addition="+(a+b));
	}
}
class perent extends child
{
	int Add, c=50, d=30;
	public void substraction()
	{
	    System.out.println("substraction= "+(c-d));	
	}
}
class grandParant extends perent
{
	   int Add, e=20, f=30;

	public void Multiplication()
		{
			System.out.println("Multiplication="+(e+f));
		}
}
public class SampleInheritance
{
public static void main(String[] args) 
{
	System.out.println("Grand child extention");
	grandParant obj= new grandParant();
	obj.addition();
	obj.substraction();
	obj.Multiplication();
	System.out.println("        ");
	System.out.println("child ectention");
	perent obj2 = new perent();
	obj2.addition();
	obj2.substraction();
	System.out.println("        ");
	System.out.println("baseClass ectention");
	child obj3 =new child();
	obj3.addition();
}
}
