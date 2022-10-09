package com.careJava.basics;

public class Constructor {
	int a;
	int b;
	Constructor(){
		System.out.println("constructor without parameters");
	}
	Constructor(int x, int y)
	{
		a=x;
		b=y;	
	}
	
	void display() {
		System.out.println("value of a="+a);
		System.out.println("value of b="+b);
	}
	
	public static void main(String[] args) {
		Constructor obj=new Constructor();
		obj.display();
		System.out.println("-------------");
		System.out.println("constructor overloading with parameters");
		System.out.println("                ");
		System.out.println("obj1 values");
		Constructor obj1=new Constructor(40,50);
		obj1.display();
		System.out.println("-------------");
		System.out.println("obj2 values");
		Constructor obj2=new Constructor(80,65);
		obj2.display();
		
    }
}
