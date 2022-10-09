package com.careJava.basics;

public class recall 
{
     int i=10, j=20, add;
     void addition()
     {
    	 add=i+j;
    	 System.out.println("i+j="+add);
     }
	 static void multiplication()
	 {
		 int q=30, w=40, mult;
		 mult=q*w;
         System.out.println("q*w="+mult);
	 }
	 
	 public static void main(String[] args) 
	 {
		 recall r=new recall();
		 r.addition();
		 multiplication();
		 System.out.println("------------");
		 System.out.println("------------");
		 r.addition();
		 multiplication();
	}
}
