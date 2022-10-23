package com.coreJava.oops.abstraction;

public class abstractChild extends abstractBase
{

	public void Mobile() 
	{
		System.out.println("To recharge your mobile click here");
	}

	public void substract() 
	{
	int l=90;
	int k=32;
	int sub=l-k;
	System.out.println(sub);
	}
	public static void main(String[] args) 
	{
		abstractChild ac= new abstractChild();
		ac.Mobile();
		ac.substract();
	}

}