package com.coreJava.LogicalPrograms;


//row=5; space=4; star;
public class Star3 
{
public static void main(String[] args) 
{
	for(int row=1; row<=25; row++)
	{
	 for(int space=0; space>=row; space--)
	 {
		 System.out.println(space);
	 }
	 for(int star=1; star<=row; star++)
	 {
		 System.out.print("*");
	 }
	 System.out.println();
	}
}
}
