package com.careJava.basics;

public class MethodWithReturnType 
{
 public static int addition(int x, int y)
 {
	 int a=x;
	 int b=y;
	 int sum=a+b;
	 System.out.println("sum of a+b= "+sum);
	 return sum; 
 }
 public int substraction(int d, int s)
 {
	 int f=d;
	 int g=s;
	 int sub=f-g;
	 System.out.println("substract of f-g= "+sub);
	 return sub;
 }
 public static void main(String[] args) 
{
 int h=addition(32, 12);
 MethodWithReturnType iu= new MethodWithReturnType();
 int j=iu.substraction(50, 5);
 int multiplication=h*j;
 System.out.println(multiplication);
}
}
