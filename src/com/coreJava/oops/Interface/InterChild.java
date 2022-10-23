package com.coreJava.oops.Interface;

public class InterChild implements InterFace1
{
	public void moblie() 
	{ 
		System.out.println("To buy Samsung Mobile click here ");
	}

	public void laptop() 
	{
		System.out.println("To buy Acer Laptop click here ");
	}
	
	public void Watch() 
	{
		System.out.println("To buy roleX watch click here ");
	}
	public static void main(String[] args) 
	{
		InterChild ic= new InterChild();
		ic.moblie();
		ic.laptop();
		ic.Watch();
	}
}
