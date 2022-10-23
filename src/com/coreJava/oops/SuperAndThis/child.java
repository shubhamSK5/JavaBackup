package com.coreJava.oops.SuperAndThis;

public class child extends parent
{
	 int a=50;
	 int b=60;
	 public void Childmethod()
	 {
		 int a=70;
			int b=80;
			System.out.println("a+b from local values ="+(a+b));
			System.out.println("to access Parent Global values ="+(super.a+super.b));
			System.out.println("to access child Global values ="+(this.a+this.b));
			System.out.println("a from parent global values + b from child Global values  ="+(super.a+this.b));
	 }
		public static void main(String[] args) 
		{
			child ch= new child();
			ch.Childmethod();
		}

}
