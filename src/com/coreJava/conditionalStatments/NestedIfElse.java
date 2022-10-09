package com.coreJava.conditionalStatments;

public class NestedIfElse {

	public static void main(String[] args) {

		int age=15;
		int weight=55;
		
		if(age>18)
		{
			
			if(weight>=50)
			{
				System.out.println("you can donate blood");
			}
			else
			{
				System.out.println("you can not donate blood");
			}
		}
		else
		{
			if(age>=16)
			{
				System.out.println("try after some years");
			}
			else
			{
				System.out.println("Thank You");
			}
					
		}

	}

}
