package com.careJava.basics;

public class baseClass {
	String name="shubham";
	protected int MobNo=1175461859;
	void display()
	{
		System.out.println("name of student= "+name);
		System.out.println("mobile No. is= "+MobNo);
	}
	public static void main(String[] args) 
	{
		baseClass bc= new baseClass();
		bc.display();
		System.out.println(bc.MobNo=36256352);
	}
	

}
