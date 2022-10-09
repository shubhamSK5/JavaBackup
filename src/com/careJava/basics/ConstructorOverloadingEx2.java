package com.careJava.basics;

public class ConstructorOverloadingEx2 {
	int s;
	int k;
	String e;
	
	ConstructorOverloadingEx2()
	{
		System.out.println("without parameters");
	}
	ConstructorOverloadingEx2(int f, int b)
	{
		s=f;
		k=b;
	}
	ConstructorOverloadingEx2(int d, int b, String a)
	{
		s=d;
		k=b;
		e=a;
	}
	void displayOnly()
	{
		System.out.println("int s="+s);
		System.out.println("int k="+k);
		System.out.println("String e="+e);
	}

	public static void main(String[] args) {
		ConstructorOverloadingEx2 withoutParameter=new ConstructorOverloadingEx2();
		withoutParameter.displayOnly();
		System.out.println("------------");
		ConstructorOverloadingEx2 WithParameter=new ConstructorOverloadingEx2(1,22,"SSK");
		WithParameter.displayOnly();
		System.out.println("------------");
		ConstructorOverloadingEx2 OverloadingWithParameter=new ConstructorOverloadingEx2(2,562);
		OverloadingWithParameter.displayOnly();

	}

}
