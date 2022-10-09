package com.careJava.basics;

public class ConstructorProgram 
{
	 String Name;
	 int MobNo;
	 static String CollegeName;
	 static String collegeAddress;
 
 /*ConstructorProgram()
  {
	 System.out.println("Name");
	 System.out.println(MobNo);
	 System.out.println("College Name");
	 System.out.println("college Address");
  }*/
 public void StudentData()
    {
	 System.out.println(Name);
	 System.out.println(MobNo);
	 System.out.println(CollegeName);
	 System.out.println(collegeAddress);
	 
    }
	public static void main(String[] args) 
	{
		 ConstructorProgram obj= new ConstructorProgram();
		 obj.Name="shubham";
		 obj.MobNo=917546185;
		 ConstructorProgram.CollegeName="COCSIT";
		 ConstructorProgram.collegeAddress="LATUR";
		 obj.StudentData();
		 System.out.println("               ");
		 ConstructorProgram obj1= new ConstructorProgram();
		 obj1.Name="satyam";
		 obj1.MobNo=123467425;
		 obj1.StudentData();
	}

}
