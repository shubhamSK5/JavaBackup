package com.careJava.basics;

public class obj2 
{
     int c=5, d=54, e;
     
     void multiplication()
     {
    	e=d*c;
    	System.out.println("multiplycation= "+e);
     }
     static void division()
     {
    	 int w=40,r=2, t;
    	 t=w/r;
    	 System.out.println("division= "+t);
     }
     public static void main(String[] args) 
     {
    	 obj2 o2=new obj2();
    	 o2.multiplication();
    	 System.out.println("----------------------");
    	 obj2.division();
    	 division();
    	 basicsMethodcalling obj1=new basicsMethodcalling();
    	 obj1.addition();
    	 obj1.display();
	}
     
     
     
     
     
     
     
     
     
     
}
