package com.coreJava.LogicalPrograms;
// Multiple of 3, 7 and 9.
public class NumberLogicalProgram 
{
  public static void main(String[] args) 
	{
		for(int i=0; i<=500; i++)
		{
			if(i%3==0 )
			{
				if(i%7==0)
				{
					if(i%9==0)
					{
						System.out.println(i);	
					}
				}
			}
		}
	}
}
