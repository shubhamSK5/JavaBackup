package com.careJava.basics;

public class ConstructorOverloading {
	int age;
	String name;
	int adharNo;
	int passportNo;
	String PanNo;
	
	ConstructorOverloading()
	{
		System.out.println("ConstructorOverloading without parameters");
	}
	ConstructorOverloading(int a, String b, int c)
	{
		System.out.println("ConstructorOverloading with parameters");
		age=a;
		name=b;
		adharNo=c;
	}
	ConstructorOverloading(int a, String b, int c, int d)
	{
		this.age=a;
		this.name=b;
		this.adharNo=c;
		this.passportNo=d;
	}
	ConstructorOverloading(int a, String b, int c, int d, String e)
	{
		age=a;
		name=b;
		adharNo=c;
		passportNo=d;
		PanNo=e;
	}
	void display()
	{
		System.out.println("age of the Gest= "+age);
		System.out.println("nameof the Gest= "+name);
		System.out.println("adharNo of the Gest= "+adharNo);
		System.out.println("passportNo of the Gest= "+passportNo);
		System.out.println("PanNo of the Gest= "+PanNo);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();
		obj.display();
		System.out.println("                ");
		System.out.println("                ");
		ConstructorOverloading obj1=new ConstructorOverloading(1,"ABK",521523);
		obj1.display();
		System.out.println("                ");
		System.out.println("                ");
		ConstructorOverloading obj2=new ConstructorOverloading(2,"SSK",921523,021);
		obj2.display();
		System.out.println("                ");
		System.out.println("                ");
		ConstructorOverloading obj3=new ConstructorOverloading(3,"JSK",721523,036, "PLK523");
		obj3.display();

	}

}
