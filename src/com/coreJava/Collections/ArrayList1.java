	package com.coreJava.Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) 
	{
		ArrayList lk= new ArrayList();
		System.out.println(lk.isEmpty());
		lk.add("Shubham");
		lk.add("Suryakant");
		lk.add("kasbe");
		lk.add(52364987);
		lk.add(43.33);
		lk.add('A');
		lk.add(null);
		System.out.println(lk.size());
		System.out.println(lk.isEmpty());
		System.out.println(lk.indexOf("shubham"));
		System.out.println(lk);
		lk.remove("shubham");
		lk.add("Aghori");
		lk.remove(1);
		System.out.println(lk);
		lk.set(4, "Kashmora");
		System.out.println(lk);
		for(Object kl:lk)
		{
			System.out.print(kl+", ");
		}
		System.out.println();
		for(int j=0;j<lk.size();j++)
		{
			System.out.print(lk.get(j)+"||");
		}
	}

}
