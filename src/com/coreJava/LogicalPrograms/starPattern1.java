package com.coreJava.LogicalPrograms;
//       *
//      **
//     ***
//    ****
//   *****
//  ******
// *******
//********
//rows=9, count=9, spaces=8;
public class starPattern1 
{
public static void main(String[] args) 
{
  for(int row=1; row<=8; row++)
  {
	  for(int space=7; space>=row; space--)
	  {
		  System.out.print(" ");
	  }
	  for(int star=1; star<=row; star++)
	  {
		  System.out.print("*");
	  }
	  System.out.println();
  } 
}
}
