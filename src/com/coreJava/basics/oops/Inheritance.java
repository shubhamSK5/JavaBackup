package com.coreJava.basics.oops;

class derived{
	String sd="shubham";
	String ds="kasbe";
	
	void displsy()
	{
		System.out.println("String sd="+sd);
		System.out.println("String ds="+ds);
	}
}
	


public class Inheritance extends derived{
	 
	int s=21;
	int d=41;
	
	void mul()
	{
		System.out.println("multiplication="+(s*d));
	}
	void div()
	{
		System.out.println("division="+(d/s));
	}

	public static void main(String[] args) {
		
		Inheritance ob= new Inheritance();
		ob.displsy();
		System.out.println("bassClass methods & objects");
		System.out.println("         ");
		System.out.println("derived class methods & objects");
		ob.mul();
		ob.div();
	}

}
