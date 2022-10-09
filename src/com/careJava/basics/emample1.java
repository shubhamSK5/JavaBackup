package com.careJava.basics;

public class emample1 {

	int eid;
    float esalary;
    String ename, ecompany, ecompanyAddres;
    
    void display()
    {
    	System.out.println("employee ID="+eid);
    	System.out.println("employee salary="+esalary);
    	System.out.println("employee name="+ename);
    	System.out.println("employee company="+ecompany);
    	System.out.println("employee companyAddres="+ecompanyAddres);
    }
     void fillData(int id, float sal, String name, String company, String companyAddres )
     {
    	 eid=id;
    	 esalary=sal;
    	 ename=name;
    	 ecompany=company;
    	 ecompanyAddres=companyAddres;
     }
	public static void main(String[] args) 
	{
		emample1 emp1= new emample1();
		emp1.fillData(1, 12444.0f, "ssk", "zsa", "mumbai");
		emp1.display();
		
        System.out.println("---------------------------");
        
        emample1 emp2= new emample1();
		emp2.fillData(2, 1235.22f, "aaa", "zsa", "mumbai");
		emp2.display();
		
		System.out.println("---------------------------");
		
		emample1 emp3= new emample1();
		emp3.fillData(3, 2315.325f, "wewe", "sa", "mumbai");
		emp3.display();
	}

}
