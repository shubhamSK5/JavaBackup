package com.careJava.basics;

public class returnTypeWithParameters 
{
   int a,b,c;
   int addition(int a,int b, int c)
   {
	   return a+b+c;	  
   }
   public static void main(String[] args) 
   {
	   returnTypeWithParameters ob=new returnTypeWithParameters();
	   int total=ob.addition(20, 30, 40);
	   System.out.println("Addition of a+b+c:"+total);
   }
}
