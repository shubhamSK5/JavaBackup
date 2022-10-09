package com.careJava.basics;

public class example {
        int eid;
        float esalary;
        String name, company, companyAddres;
        
        void display()
        {
        	System.out.println("employee ID="+eid);
        	System.out.println("employee salary="+esalary);
        	System.out.println("employee name="+name);
        	System.out.println("employee company="+company);
        	System.out.println("employee companyAddres="+companyAddres);
        }
        
        
        
	public static void main(String[] args) 
	{
		example emp1= new example();
		emp1.eid=1;
		emp1.esalary=1200.25f;
		emp1.name="shubham";
		emp1.company="azx";
		emp1.companyAddres="mumbai";
		emp1.display();
        System.out.println("---------------------------");
		example emp2= new example();
		emp2.eid=2;
		emp2.esalary=2200.25f;
		emp2.name="sham";
		emp2.company="azx";
		emp2.companyAddres="mumbai";
		emp2.display();
		System.out.println("---------------------------");
		example emp3= new example();
		emp3.eid=3;
		emp3.esalary=3200.25f;
		emp3.name="sam";
		emp3.company="azx";
		emp3.companyAddres="mumbai";
		emp3.display();

	}

}
