package com.coreJava.conditionalStatments;

public class NestedIfElse2 {

	public static void main(String[] args) {
		int g=50;
		if(g<=20)
		{
			if(g<=10)
			{
				System.out.println("nested if block");
			}
			System.out.println("if block");
		}
		else
		{
			if(g<=30)
			{
				System.out.println("else block");
			}
			System.out.println("nesting of the Conditions ");
		}

	}

}
