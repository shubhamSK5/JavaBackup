package com.coreJava.LogicalPrograms;


//row=8, space=5, Star=;

public class Tringle 
{
public static void main(String[] args) 
{
for(int row=0; row<=8; row++)
{
	for(int space=8; space>=row; space--)
	{
		System.out.print(" ");
	}
	for(int star=0; star<=row; star++)
	{
		System.out.print("*");
	}
	System.out.println();
}

}
}
