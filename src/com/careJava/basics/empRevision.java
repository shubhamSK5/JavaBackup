package com.careJava.basics;

public class empRevision 
{
   int eId;
   String eName;
   int eSalary;
   static String ecompanyName, ecompanyAddress;
   void display()
   {
	   System.out.println("employee ID="+eId);
	   System.out.println("employee Name="+eName);
	   System.out.println("employee Salary="+eSalary);
	   System.out.println("employee companyName="+ecompanyName);
	   System.out.println("employee companyAddress="+ecompanyAddress);
   }
   void fillData(int Id,String Name, int Salary ) 
   {
	   eId=Id;
	   eName=Name;
	   eSalary=Salary;
   }
   public static void main(String[] args) 
   {
	   empRevision fd=new empRevision();
	   fd.fillData(1, "sam", 15002);
	   empRevision.ecompanyName="google";
	   empRevision.ecompanyAddress="Goa";
	   fd.display();
	   DiffrentClass.c='B';
	   System.out.println("                ");
	   empRevision fd2=new empRevision();
	   fd2.fillData(2, "sham", 21025);
	   empRevision.ecompanyName="google";
	   empRevision.ecompanyAddress="Goa";
	   fd2.display();

	   DiffrentClass sMC= new DiffrentClass();
	   sMC.Nmethod();
	   sMC.eMob=523652;
	   sMC.sMethod();
	   
			   
}
}
