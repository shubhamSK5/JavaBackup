package com.careJava.basics;

public class returnPara 
{
    int division(int z, int a,int q)
    {
    	return z/a/q;
    }
    
    public static void main(String[] args) 
    {
    	returnPara d1=new returnPara();
    		int total=d1.division(1000, 4, 2);
    	System.out.println("division= "+total);
	}
}
