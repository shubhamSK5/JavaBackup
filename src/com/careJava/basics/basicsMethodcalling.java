package com.careJava.basics;

public class basicsMethodcalling 
{

	int s=20, k=30,total;
	
	void addition()
	{
		total=s+k;
		System.out.println("addition of s+k="+ total);
	}
	void display()
	{
		System.out.println("total  "+ total);
	}
	
	public static void main(String[] args) 
	{
		basicsMethodcalling obj1=new basicsMethodcalling();
		obj1.addition();
		obj1.display();
		obj1.s=80;
		obj1.addition();
		obj1.display();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
