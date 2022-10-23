package com.coreJava.Strings;

public class MethodsInString2 {

	public static void main(String[] args) 
	{
		String q="kasbe Shubham suryakant";
		String p= new String("Automation");
		System.out.println(p.length());
		System.out.println(p.charAt(2));
		System.out.println(q.indexOf("m"));
		System.out.println(p.lastIndexOf("A")); //Search Right to Left
		System.out.println(q.endsWith("nt"));
		System.out.println(q.startsWith("as"));
		System.out.println(q.substring(6));
		System.out.println(p.substring(2,4));
		System.out.println(q.contains(p));
		System.out.println(q.replace("kasbe", "QA"));
	}

}
