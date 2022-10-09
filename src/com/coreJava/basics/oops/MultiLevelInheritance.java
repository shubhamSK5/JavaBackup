package com.coreJava.basics.oops;

import com.careJava.basics.baseClass;

class tobe extends baseClass{
 void  sameClassMultiInheritance()
 {
	 System.out.println("MultiLeveling the Inheritance ");
	 System.out.println("sucessful");
 }
}	
class TwoGmobile extends tobe{

	void AdharNo()
	{
		System.out.println("Adhar No.is 5632541");
	}
	void Address() {
		System.out.println("laxmi colony, MangalChaya nivas");
	}		
}
class multi extends TwoGmobile{
	void Sucess()
	{
		System.out.println("hence MultiLevel Inheritance is Sucessfully Done");
	}
}
public class MultiLevelInheritance {
	
	public static void main(String[] args) {
		multi derived= new multi();	
		System.out.println("BaseClass Veriables & Methods");
		System.out.println("                ");
		System.out.println("Extended Class Veriables & Methods");
		derived.sameClassMultiInheritance();
		System.out.println("                ");
		derived.AdharNo();
		derived.Address();
		System.out.println("                ");
		System.out.println("                ");
		derived.Sucess();
	}
	
}
	
