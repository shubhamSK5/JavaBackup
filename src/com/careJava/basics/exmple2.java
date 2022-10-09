package com.careJava.basics;

public class exmple2 {

	int eid;
    float esalary;
    String ename; 
   static String ecompany, ecompanyAddres;
    
    void display()
    {
    	System.out.println("employee ID="+eid);
    	System.out.println("employee salary="+esalary);
    	System.out.println("employee name="+ename);
    	System.out.println("employee company="+ecompany);
    	System.out.println("employee companyAddres="+ecompanyAddres);
    }
     void fillData(int id, float sal, String name )
     {
    	 eid=id;
    	 esalary=sal;
    	 ename=name;
     }
	public static void main(String[] args)
	{
		exmple2 ep1= new exmple2();
		exmple2.ecompany="Google";
		exmple2.ecompanyAddres="Bangaluru";
	    ep1.fillData(1, 81253.23f, "shubham");
	    ep1.display();
	  
	    System.out.println("            ");
	    System.out.println("            ");
	  
	    exmple2 ep2= new exmple2();
		exmple2.ecompany="Google";
		exmple2.ecompanyAddres="Bangaluru";
	    ep2.fillData(1, 7453.23f, "sham");
	    ep2.display();
	   
	    System.out.println("            ");
	    System.out.println("            ");
	    
	    exmple2 ep3= new exmple2();
		exmple2.ecompany="Google";
		exmple2.ecompanyAddres="Bangaluru";
	    ep3.fillData(1, 65253.23f, "sam");
	    ep3.display();
	}
	

}
