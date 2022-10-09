package com.coreJava.basics.oops;


class practicingEncspsulation {
	 private int a;
	 protected int b;
	 void setData(int x, int y)
	 {
		 a=x;
		 b=y;		 
	 }
	 void display()
	 {
		 System.out.println("value of a="+a);
		 System.out.println("value of b="+b);
	 }
}


public class Encapsulation {
public static void main(String[] args) {
		practicingEncspsulation obj= new practicingEncspsulation();
		obj.setData(20, 30);
		obj.display();
	}

}
