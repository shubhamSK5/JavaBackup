package com.careJava.basics;

public class employe 
{
    int esal, eid;
    String ename;
    static String ecompany, ecompanyaddress;
   void display()
    {
    	System.out.println("employee id="+eid);
    	System.out.println("employee name="+ename);
    	System.out.println("employee salary="+esal);
    	System.out.println("employee company="+ecompany);
    	System.out.println("employee companyaddress="+ecompanyaddress);	
    }
	void needData(int id, int sal, String name )
		{
			eid=id;
			esal=sal;
			ename=name;		
		}
	public static void main(String[] args) 
	{
		employe emp1=new employe();
		emp1.needData(12, 25896, "sak");
		employe.ecompany="hp";
		employe.ecompanyaddress="NOIDA";
		emp1.display();
		System.out.println("           ");
		System.out.println("-----------");
		System.out.println("           ");
		employe emp2=new employe();
		emp2.needData(22, 56354, "sak");
		employe.ecompany="google";
		employe.ecompanyaddress="Mumbai";
		emp2.display();
		
	}

}
